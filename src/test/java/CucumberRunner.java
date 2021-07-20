import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // this inform java to run the below class with cucumber framework
@Cucumber.Options(features="Features", format = {"pretty","html:reports/test-report"}) // this tells where the feature scripts /tc scripts are kept
public class CucumberRunner {



}
