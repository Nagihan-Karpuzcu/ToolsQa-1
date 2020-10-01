package com.cbt.tests;

import com.cbt.pages.LoginPage;
import com.cbt.pages.TextBox;
import com.cbt.utilities.Driver;
import com.cbt.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class deneme extends  TestBase{
    @Test
    public void test1() throws InterruptedException {
      //  LoginPage.getFirstPageElements("Elements");
      // TextBox textBox=new TextBox();
        //textBox.navigateToModule("Forms","Buttons");
       // Driver.get().findElement(By.xpath("//div[@class='header-text']")).click();
      //  Driver.get().findElement(By.xpath("//div[@class='header-text']")).click();
      //  Driver.get().findElement(By.xpath("//li[@class='btn btn-light ']")).click();
/*
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoqa.com/");
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();*/
    LoginPage loginPage=new LoginPage();
   // loginPage.navigateToModule("Forms","Practice Form");
    loginPage.navigateToModule("Widgets","Slider");
    }

}
