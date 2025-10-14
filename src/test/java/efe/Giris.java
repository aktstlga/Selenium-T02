package efe;

import Utility.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Giris {
    public static void main(String[] args) {

        WebDriver tarayici = new ChromeDriver();


        tarayici.get("https://form.jotform.com/221934510376353");


        Function.Wait(3);

        tarayici.quit();

    }
}
