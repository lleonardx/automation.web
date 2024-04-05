package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

    }
    @Test
    public void primeiroTest(){
        String currentUrl = driver.getCurrentUrl();
        String expected = "https://automationexercise.com/";
        WebElement header = driver.findElement(By.xpath("/html/head/title"));
        String titulo = header.getText();
        Assert.assertNotEquals("Automation Exercise", titulo);
        System.out.println(titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
