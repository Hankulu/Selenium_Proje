package Proje_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _03_NegativeLogin extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("bahriye12356@gmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456789234");

        WebElement loginBtn=driver.findElement(By.cssSelector("[value=\"Log in\"]"));
        loginBtn.click();


        WebElement txtActual=driver.findElement(By.cssSelector("div[class=\"validation-summary-errors\"] li"));
        Assert.assertTrue(txtActual.getText().contains("No customer account found"));










        BekleKapat();
    }
}
