package Persembe;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorOrnek extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email = driver.findElement(By.cssSelector(""));
        email.clear();
        email.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.cssSelector(""));
        password.clear();
        password.sendKeys("admin123");

        WebElement submit = driver.findElement(By.cssSelector(""));
        submit.click();

        WebElement shoppingCartMesaj = driver.findElement(By.cssSelector(""));
        Assert.assertTrue("Aranan mesaj bulunamadı", shoppingCartMesaj.getText().contains("SHOPPING CART"));

        closeAllWndows();
    }
}
