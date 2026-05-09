package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class sixth_task {

    public static void main(String[] args) {

        // Step 1: Open browser
        WebDriver driver = new ChromeDriver();

        // Step 2: Open Google
        driver.get("https://www.google.com");

        // Step 3: Create wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 4: Wait and find search box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );

        // Step 5: Type "java" and press ENTER
        searchBox.sendKeys("java", Keys.ENTER);

        // Step 6: Wait for first result and click
        WebElement firstResult = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("h3"))
        );

        firstResult.click();

        // Step 7: Print title
        System.out.println(driver.getTitle());

        // Step 8: Close browser
        driver.quit();
    }
}