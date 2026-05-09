package com.krce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class third_task {
    WebDriver driver;
    @BeforeTest
    public void start()
    {
         driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public  void testmaterial_01()
    {
        System.out.println("Test 1 running");
    }

    @Test
    public  void testmaterial_02()
    {
        System.out.println("Test 2 running");
    }

    @Test
    public  void testmaterial_03()
    {
        System.out.println("Test 3 running");
    }
    @AfterTest
    public void end()
    {
       driver.quit();
    }
}
