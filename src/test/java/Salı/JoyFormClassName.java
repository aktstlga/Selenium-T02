package Salı;

import Utility.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JoyFormClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("Element.getText() = " + element.getText());
        // findElement: locator birden fazla elemanı işaret ederse, sadece ilkini alır.

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());

        for(WebElement e: labels){
            System.out.println(e.getText());
        }

        Function.Wait(2);
        driver.quit();
    }
}
