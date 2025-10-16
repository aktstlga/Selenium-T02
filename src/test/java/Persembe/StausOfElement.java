package Persembe;

import Utility.BaseDriver;
import Utility.Function;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StausOfElement extends BaseDriver {
    @Test
    public  void  Test(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        Function.Wait(2);

        WebElement tuesday = driver.findElement(By.cssSelector("input[id='gwt-debug-cwCheckBox-Tuesday-input']"));

        System.out.println("Tuesday display edildi mi = " + tuesday.isDisplayed());
        System.out.println("Tuesday enable edildi mi = "+ tuesday.isEnabled());
        System.out.println("Tuesday select edildi mi = "+ tuesday.isSelected());

        tuesday.click();

        System.out.println("Tuesday select edildi mİ = "+ tuesday.isSelected());

    }
}
