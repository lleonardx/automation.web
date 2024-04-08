package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    Driver driverWeb;
    WebDriver driver;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br/");

    }
    @Test
    public void primeiroTest(){
        WebElement header = driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4"));
        String titulo = header.getText();
        Assert.assertEquals("Porque Tempo É Conhecimento.", titulo);
        System.out.println(titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
