package Salı;

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdIleBulma {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.akakce.com/");

        WebElement aramaKutusu = driver.findElement(By.id("q")); //Q id ile yazılmış olan elemanı bul.
        aramaKutusu.sendKeys("Portakal");

        driver.quit();
    }
}
