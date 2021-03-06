import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // this inform java to run the below class with cucumber framework
//@Cucumber.Options(features="Features", format = {"pretty","html:reports/test-report"}) // this tells where the feature scripts /tc scripts are kept
//@CucumberOptions(plugin = {"pretty", "html:target/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},features={"src/test/resources/Features/Login.featureonhold"},monochrome = true) // this tells where the feature scripts /tc scripts are kept
@CucumberOptions(plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features={"src/test/resources/Features"},
  //      tags= "@smoke",monochrome = true)
        monochrome = true)
public class CucumberRunner {



}
