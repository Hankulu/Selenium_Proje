package Proje_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;


public class _02_PositiveLogin extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("bahriye123@gmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456789");

        WebElement loginBtn=driver.findElement(By.cssSelector("[value=\"Log in\"]"));
        loginBtn.click();


        WebElement txtActual=driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(txtActual.getText().contains("Log out"));























        BekleKapat();
    }
}
