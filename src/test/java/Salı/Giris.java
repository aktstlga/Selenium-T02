package Salı;

import Utility.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Giris {
    public static void main(String[] args) {

        WebDriver tarayici = new ChromeDriver(); // polymorphism

        tarayici.get("https://www.akakce.com/");

        Function.Wait(3);

        tarayici.quit();
    }
}
