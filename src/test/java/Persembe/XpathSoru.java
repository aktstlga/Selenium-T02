package Persembe;

import Utility.BaseDriver;
import Utility.Function;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathSoru extends BaseDriver {
    @Test
    public void SepetTesti() {
        driver.get("https://www.saucedemo.com/");
        Function.Wait(2);

        WebElement username = driver.findElement(By.xpath(""));
        username.sendKeys("standard_user");
        Function.Wait(2);

        WebElement password = driver.findElement(By.xpath(""));
        password.sendKeys("secret_sauce");
        Function.Wait(2);

        WebElement loginButton = driver.findElement(By.xpath(""));
        loginButton.click();
        Function.Wait(2);

        //1.Ürün sepete ekleniyor
        Function.Wait(2);//
        WebElement product1 = driver.findElement(By.xpath(""));
        product1.click();
        Function.Wait(2);

        WebElement addToCart = driver.findElement(By.xpath(""));
        addToCart.click();
        Function.Wait(2);

        WebElement btnBack = driver.findElement(By.xpath(""));
        btnBack.click();
        Function.Wait(2);

        //2.Ürün sepete ekleniyor
        WebElement product2 = driver.findElement(By.xpath(""));
        product2.click();
        Function.Wait(2);

        WebElement addToCart2 = driver.findElement(By.xpath(""));
        addToCart2.click();
        Function.Wait(2);
    }
}