package com.krce;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fourth_task {
    WebDriver driver;
    @BeforeTest
    public void start()
    {
        driver=new ChromeDriver();
        driver.get("https://duckduckgo.com/");
    }

    @Test
    public void tseting()
    {
        WebElement a=driver.findElement(By.id("searchbox_input"));
        a.sendKeys("java", Keys.ENTER);

        String str=driver.getTitle();
        Assert.assertEquals(str,"java at DuckDuckGo");
    }

    @AfterTest
    public void end()
    {
       driver.quit();
    }
}

