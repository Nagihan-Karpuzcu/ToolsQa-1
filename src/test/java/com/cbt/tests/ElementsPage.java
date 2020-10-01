package com.cbt.tests;

import com.cbt.utilities.Driver;
import com.cbt.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ElementsPage extends TestBase {
    @Test
    public void test1() throws InterruptedException {
      FirstPage.getFirstPageElements("Elements").click();
        Driver.get().navigate().back();
        Thread.sleep(3000);
        FirstPage.getFirstPagesElementsText("Forms");

      //  Driver.get().findElement(By.xpath("//div[@class='card-up']")).click();

    }
}
