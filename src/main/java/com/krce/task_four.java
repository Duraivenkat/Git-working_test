package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_four {
    public static void main(String []args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement a= driver.findElement(By.name("q"));
        a.sendKeys("java");
        a.click();

        String str= driver.getTitle();
        if(str =="Selenium")
        {
            System.out.println("done");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
