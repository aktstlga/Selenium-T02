package ruya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeedbackForm {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstNameInput = driver.findElement(By.id("first_8"));
        firstNameInput.sendKeys("Ruya");

        WebElement lastNameInput = driver.findElement(By.id("last_8"));
        lastNameInput.sendKeys("Tiras");
    }
}
