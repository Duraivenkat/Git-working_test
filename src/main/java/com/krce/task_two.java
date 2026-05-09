package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_two {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Find search box
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type text
        searchBox.sendKeys("Selenium tutorial");

        // Press ENTER
        searchBox.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}