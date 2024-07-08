package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    private WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitulo() {
        WebElement header = driver.findElement(By.xpath("/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4"));
        String titulo = header.getText();
        return titulo;
    }
    public void clickBotao() {
        WebElement btnTitulo = driver.findElement(By.xpath("//div/div/div/section[2]/div[3]/div/div/div[2]/div/div/a/span/span[2]"));
        btnTitulo.click();
    }

}
