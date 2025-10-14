package aslihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornek_01 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver(); // polymorphism

        driver.get("https://form.jotform.com/221934510376353");

        WebElement namebox= driver.findElement(By.id("first_8"));
namebox.sendKeys("aslihan");

WebElement surnamebox= driver.findElement(By.id("last_8"));
surnamebox.sendKeys("gulluoglu");



    }
}
