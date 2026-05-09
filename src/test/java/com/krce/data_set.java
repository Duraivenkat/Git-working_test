package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class data_set {

    public WebDriver driver ;
    public WebDriverWait wait;

    @BeforeTest
    public void setup()
    {
        driver=new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @DataProvider(name="logindata")
    public Object[][] datass()
    {
        Object[][]  data = new  Object[][]
                {
                        {"tomsmith","SuperSecretPassword!", true},
                        {"Durai","1234567", false},
                        {"Duraivenkat","Durai@143", false},
                        {"hari","000000", false},
                        {"","1234567", false},
                        {"Durai","", false},
                        {"","", false},
                        {"@@@@@","-------", false},

                };
        return data;
    }

    @Test(dataProvider = "logindata")
    public void login_test(String s,String b, boolean shouldLogin) throws InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(s);
        driver.findElement(By.id("password")).sendKeys(b);
        driver.findElement(By.className("radius")).click();
        WebElement flash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
        boolean actualResult = flash.getText().contains("You logged into a secure area!");


        Assert.assertEquals(actualResult, shouldLogin);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
