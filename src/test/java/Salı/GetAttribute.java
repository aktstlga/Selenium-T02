package Salı;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.id("sublabel_8_first"));

        System.out.println("Class Adı =" +element.getAttribute("class"));
        System.out.println("For Adı =" +element.getAttribute("for"));
        System.out.println("İd Adı =" +element.getAttribute("id"));
        System.out.println("Style Adı =" +element.getAttribute("style"));
    }
}
