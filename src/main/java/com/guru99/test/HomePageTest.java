package com.guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    //public String baseUrl = "https:/demo.guru99.com/v4/";
    public String username = "mngr469185";
    public String password = "uquhaga";
    public static WebDriver driver;

    @BeforeClass
            public void setup()
    {
        System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"src/Driver/geckodriver");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/v4");
    }

    @Test
    public void VerifyLogin()
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


    }
