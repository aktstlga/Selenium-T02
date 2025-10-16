package Persembe.Action;

import Utility.BaseDriver;
import Utility.Function;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionOrnek extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://demoqa.com/buttons");
        Actions action = new Actions(driver);

        Function.Wait(2);

        WebElement buttonClick = driver.findElement(By.cssSelector("button[id='Iqsjp']"));
        //buttonClick.click();
        Action action1 =  action.moveToElement(buttonClick).click().build();
        action1.perform();

        action.moveToElement(buttonClick).click().build().perform();

        new Actions(driver).moveToElement(buttonClick).click().build().perform();

        new Actions(driver).click(buttonClick).build().perform();
    }
}
