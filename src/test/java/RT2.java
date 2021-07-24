import org.apache.commons.io.FileUtils;
import org.bson.io.BsonOutput;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class RT2 {

    private static SimpleDateFormat ts = new SimpleDateFormat("MMddyy_hhmms");

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {


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
            String color = (driver.findElement(By.cssSelector(".a-link-normal .aok-inline-block"))).getCssValue("Color");
            // System.out.println("COLOR is : " + color);

            //highlight element through javascript
            WebElement ele = driver.findElement(By.cssSelector(".hm-icon-label"));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].style.border='2px solid red'", ele);

            // driver.findElement(By.cssSelector("div#desktop-grid-3")).click();
            //highlighting without creating object of WebElement
            jsExecutor.executeScript("arguments[0].style.border='12px solid red'", driver.findElement(By.cssSelector("div#desktop-grid-3>div > div.a-cardui-header")));

            //Capture screenshot
            //commons.io import is necessary we have imported and added in the pom dependencies
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currenttimestamp = ts.format(System.currentTimeMillis());
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\test-output\\screengrabs\\" + currenttimestamp + ".jpg"));
           

            //****************Exiting the Script******************
            Thread.sleep(2000);
            driver.quit();
        } catch (Exception e) {
            System.out.println("Exception aya " + e.getStackTrace());
            System.out.println(e.getMessage());
            driver.quit();
        }
    }
}
