package Proje_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _01_hesapOluşturma extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.linkText("Register"));
        register.click();

        WebElement gender=driver.findElement(By.id("gender-female"));
        gender.click();

        WebElement firstName=driver.findElement(By.id("FirstName"));
        firstName.sendKeys("bahriye");

        WebElement lastName=driver.findElement(By.id("LastName"));
        lastName.sendKeys("hankulu");

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("bahriye123@gmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456789");

        WebElement comfirmPassword=driver.findElement(By.id("ConfirmPassword"));
        comfirmPassword.sendKeys("123456789");

        WebElement registerBtn=driver.findElement(By.id("register-button"));
        registerBtn.click();


















        BekleKapat();
    }
}
