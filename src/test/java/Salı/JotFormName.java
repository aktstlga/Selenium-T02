package Salı;

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JotFormName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameInput = driver.findElement(By.name("q8_name[first]"));
        nameInput.sendKeys("Tolga");

        WebElement surnameInput = driver.findElement(By.name("q8_name[last]"));
        surnameInput.sendKeys("Aktas");

        Function.Wait(2);
        driver.quit();
    }
}
