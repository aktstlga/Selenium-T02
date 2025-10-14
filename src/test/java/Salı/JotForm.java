package Salı;

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JotForm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameBox = driver.findElement(By.id("first_8"));
        nameBox.sendKeys("Tolga");

        WebElement surnameBox = driver.findElement(By.id("last_8"));
        surnameBox.sendKeys("Aktas");

        Function.Wait(2);
        driver.quit();
    }
}