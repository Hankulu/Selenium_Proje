package Proje_02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.time.Duration;
import java.util.List;

public class YouTube extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement search=driver.findElement(By.cssSelector("[name=\"search_query\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name=\"search_query\"]")));
        search.sendKeys("Selenium");

        WebElement searchButton= driver.findElement(By.id("search-icon-legacy"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("search-icon-legacy")));
        searchButton.click();


        int count=0;

        while (true) {

            List<WebElement> video = driver.findElements(By.cssSelector("img[id='img'][ src^='https://i.ytimg.com/'][width='360']"));

            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("img[id='img'][ src^='https://i.ytimg.com/'][width='360']"),count+2));

            wait.until(ExpectedConditions.elementToBeClickable(video.get(count)));
            js.executeScript("arguments[0].scrollIntoView()",video.get(count));
            if (count==79){
                video.get(count).click();
                System.out.println("video.get(count+1).getAttribute(\"title\") = " + video.get(count+1).getAttribute("title"));
                break;
            }
            count++;

        }

        BekleKapat();












    }

}

