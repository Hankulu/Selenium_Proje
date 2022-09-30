package Proje_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04_PlaceAnOrder extends BaseStaticDriver {
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

       WebElement urun=driver.findElement(By.cssSelector("a[href=\"/141-inch-laptop\"] img"));
       urun.click();

        WebElement addToCart=driver.findElement(By.cssSelector("script[type=\"text/javascript\"]~input"));
        addToCart.click();

        Bekle(1);

        WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        WebElement onay=driver.findElement(By.id("termsofservice"));
        onay.click();

        WebElement checkout=driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement continues=driver.findElement(By.xpath("(//input[@class=\"button-1 new-address-next-step-button\"])[1]"));
        continues.click();
        Bekle(1);

        WebElement continues2=driver.findElement(By.xpath("(//*[@class=\"button-1 new-address-next-step-button\"])[2]"));
        continues2.click();
        Bekle(1);

        WebElement continues3=driver.findElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]"));
        continues3.click();
        Bekle(1);

        WebElement continues4=driver.findElement(By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]"));
        continues4.click();
        Bekle(1);

        WebElement continues5=driver.findElement(By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]"));
        continues5.click();
        Bekle(1);

        WebElement confirm=driver.findElement(By.xpath("//*[@onclick=\"ConfirmOrder.save()\"]"));
        confirm.click();
        Bekle(1);

        WebElement txtActual=driver.findElement(By.cssSelector("div[class=\"title\"] strong"));
        Assert.assertTrue(txtActual.getText().contains("Your order has been successfully processed!"));

        WebElement continueSon=driver.findElement(By.xpath("//*[@class=\"button-2 order-completed-continue-button\"]"));
        continueSon.click();





        BekleKapat();
    }
}
