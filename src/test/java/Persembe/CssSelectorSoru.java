package Persembe;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorSoru extends BaseDriver {
    // Senaryo: (Bu soruda bulunacak elemanın hiç bir attribute kullanılmadan elemnnlar bulunmalıdır.)
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email=driver.findElement(By.cssSelector(""));
        email.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.cssSelector(""));
        password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.cssSelector(""));
        submit.click();

        WebElement shoppingCartMesaj=driver.findElement(By.cssSelector(""));

        Assert.assertTrue("Aranan mesaj bulunamadı", shoppingCartMesaj.getText().contains("SHOPPING CART"));

        closeAllWndows();
    }
}
