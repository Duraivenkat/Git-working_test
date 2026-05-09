package com.krce;

// Import Selenium classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {

        // Step 1: Create WebDriver object (this controls the browser)
        WebDriver driver = new ChromeDriver();

        // Step 2: Open a website (Google)
        driver.get("https://www.google.com");

        // Step 3: Print message in console
        System.out.println("Google opened successfully");

        // Step 4: Close browser
        driver.quit();
    }
}