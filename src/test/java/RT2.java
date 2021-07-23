import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RT2 {
    public  static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // ways to get to the url     //driver.get("https://www.amazon.in/");

        driver.navigate().to("https://www.amazon.in/");

        //   full screen    driver.manage().window().fullscreen();
        driver.manage().window().maximize();//to maximize it to full screen

        //fluent wait
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".a-link-normal .aok-inline-block"))));

        // Getting color of an element in the RGB value
        String color= (driver.findElement(By.cssSelector(".a-link-normal .aok-inline-block"))).getCssValue("Color");
        System.out.println("COLOR is : " + color);

        //highlight element through javascript
        WebElement ele=  driver.findElement(By.cssSelector(".hm-icon-label"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='2px solid red'", ele);










        //****************Exiting the Script******************
        Thread.sleep(1000);
        driver.quit();
    }
}
