package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Wait imports
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class five_task {

    public static void main(String[] args) {

        // Step 1: Create browser (open Chrome)
        WebDriver driver = new ChromeDriver();

        // Step 2: Open Google website
        driver.get("https://www.google.com");

        // Step 3: Create WAIT (max 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 4: Wait until search box is visible
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );

        // Step 5: Type "java" and press ENTER
        searchBox.sendKeys("java", Keys.ENTER);

        // Step 6: Get page title
        String title = driver.getTitle();

        // Step 7: Print title
        System.out.println(title);

        // Step 8: Close browser
        driver.quit();
    }
}