package com.jessicaoliveira;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

    @Test
    public void teste(){
        System.setProperty("webdriver.gecko.driver", "D:\\Workspace 2024\\drives\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1200,765));
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
        driver.quit();
    }
}
