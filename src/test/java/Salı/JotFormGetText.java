package Salı;

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JotFormGetText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement subheader = driver.findElement(By.id("subHeader_1"));
        String textOfSubheaderPart = subheader.getText();

        System.out.println("Elementin yazısı: "+ textOfSubheaderPart);

        Function.Wait(2);
        driver.quit();
    }
}

