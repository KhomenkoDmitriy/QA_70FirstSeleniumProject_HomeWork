package com.khomenko.testhomewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestHomework {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openSiteHomework(){
       System.out.println("Site opened");
    }

    @Test
    public void findElementByCssSelector(){
        //driver.findElement(By.tagName("h2"));
        //tag name
        driver.findElement(By.cssSelector("h2"));

        //driver.findElement(By.id("#small-searchterms"));
        driver.findElement(By.cssSelector("#small-searchterms"));

        //driver.findElement(By.className(".search-box"));
        driver.findElement(By.cssSelector(".search-box"));

        //contains
        driver.findElement(By.cssSelector("[class*='wrapper']"));

        //start
        driver.findElement(By.cssSelector("[class^='master']"));

        //end to
        driver.findElement(By.cssSelector("[class$='page']"));

        driver.findElement(By.cssSelector("[href='/books']"));

        //> one or more step below
        driver.findElement(By.cssSelector(".footer-menu-wrapper .column.information"));

        WebElement headerLinks = driver.findElement(By.cssSelector(".header-links-wrapper:nth-child(2)"));
        System.out.println(headerLinks.getText());

        WebElement headerMenu = driver.findElement(By.cssSelector(".header-menu:nth-child(3)"));
        System.out.println(headerMenu.getText());


    }


    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
