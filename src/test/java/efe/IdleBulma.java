package efe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdleBulma {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement isimKutusu = driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("efe");
        WebElement soyisimkutusu = driver.findElement(By.id("last_8"));
        soyisimkutusu.sendKeys("ersan");


    }
}
