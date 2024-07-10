package com.jessicaoliveira;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

    @Test
    public void teste(){
        System.setProperty("webdriver.gecko.driver", "D:\\Workspace 2024\\drives\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }
}
