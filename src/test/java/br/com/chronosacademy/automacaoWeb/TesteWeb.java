package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
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

    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br/");
        principalPage = new PrincipalPage(driver);
    }
    @Test
    public void primeiroTeste(){
        String titulo = principalPage.getTitulo();
        Assert.assertEquals("Porque Tempo É Conhecimento.", titulo);
        System.out.println(titulo);
    }
    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        String titulo = cursoPage.getTitulo2();
        Assert.assertEquals("Conheça todos os nossos cursos." , titulo);
        System.out.println(titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
