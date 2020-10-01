package com.cbt.pages;

import com.cbt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
        @FindBy(xpath = "//div[@class='card-up']")
        public WebElement Elements;
        @FindBy(xpath = "(//div[@class='card-up'])[2]")
    public  WebElement Forms;
        @FindBy(xpath = "(//div[@class='card-up'])[3]")
    public WebElement Alerts;
        @FindBy(xpath = "(//div[@class='card-up'])[4]")
        public WebElement widgets;
        @FindBy(xpath = "(//div[@class='card-up'])[5]")
        public WebElement cards;
        @FindBy(xpath = "(//div[@class='card-up'])[6]")
        public WebElement bookStore;

        public LoginPage(){
            PageFactory.initElements(Driver.get(),this);
        }


    public static  void getFirstPageElements(String elementName){
        WebElement element = Driver.get().findElement(By.xpath("//h5[text()='" + elementName + "']/../../.."));
        element.click();
      //  return element;
    }
    public static String getFirstPagesElementsText(String str){
        str = Driver.get().findElement(By.xpath("//h5[text()='" + str + "']")).getText();
        System.out.println(str);
        return str;
    }
    public void navigateToModule(String tab,String modul) throws InterruptedException {

        switch (tab){
            case "Elements":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])")).click();
                break;
            case "Forms":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
                break;
            case "Alerts":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
                break;
            case "Widgets":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
                break;
            case "Interactions":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[5]")).click();
                break;
            case "Book":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[6]")).click();
                break;
        }

        WebElement module   = Driver.get().findElement(By.xpath("//span[text()='"+modul+"']"));
        module.click();

    }



}
