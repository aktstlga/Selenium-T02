package Salı;

//Ben hatalı bir locator kullanırsam.
//FindElement ne hatası verir, FindElements ne hatası verir.

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JoyFormFindElementElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

       // WebElement element = driver.findElement(By.id("BirKızSevdimEllerAldı"));
       // element.sendKeys(" ");

        List<WebElement> elements = driver.findElements(By.id("BirKızSevdimEllerAldı"));
        System.out.println(elements.size());

        Function.Wait(3);
        driver.quit();
    }
}
