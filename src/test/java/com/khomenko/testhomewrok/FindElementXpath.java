package com.khomenko.testhomewrok;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementXpath {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//h2"));

        driver.findElement(By.xpath("//*[@id='small-searchterms']"));

        driver.findElement(By.xpath("//*[@class='header-links']"));

        driver.findElement(By.xpath("//*[@class='top-menu']//*[@href='/books']"));

        driver.findElement(By.xpath("//*[starts-with(@class,'master-wrapper-content')]"));

        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
        System.out.println(text.getText());
        System.out.println("-----------------------");

        driver.findElement(By.xpath("//*[@class='footer']//*[@class='footer-menu-wrapper']"));


        driver.findElement(By.xpath("//*[@class='picture']//*[@href='/141-inch-laptop']/img"));

        List<WebElement> list = driver.findElements(By.xpath("//ul"));
        System.out.println(list.size());
        System.out.println("-----------------------");

        WebElement list1 = driver.findElement(By.xpath("//*[@class='list']//li[2]"));
        System.out.println(list1.getText());


    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}

