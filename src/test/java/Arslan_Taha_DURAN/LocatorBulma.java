package Arslan_Taha_DURAN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBulma {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name = driver.findElement(By.id("first_8"));
        name.sendKeys("ARSLAN TAHA");

        WebElement lastName = driver.findElement(By.id("last_8"));
        lastName.sendKeys("DURAN");

        driver.quit();
    }
}
