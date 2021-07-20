import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginFB {

    public WebDriver driver;
    @Before
    public void setup(){
        //initializa driver
    //    System.out.println("path: " + System.getProperty("user.dir") + "***"+System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
        driver =new ChromeDriver();


    }
    @Given("User is on facebook page")
    public void user_is_on_facebook_page() {
        // Write code here that turns the phrase above into concrete actions

        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
     //   throw new io.cucumber.java.PendingException();
    }

    @When("user enter {string}")
    public void user_enter(String string) {

        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("validate successful login message")
    public void validate_successful_login_message() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("user is able to see profile page")
    public void user_is_able_to_see_profile_page() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }

    @When("user enter username and password")
    public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
      //  throw new io.cucumber.java.PendingException();
    }
    @After
    public void Quit(){
        //driver.quit
        driver.quit();
    }
}
