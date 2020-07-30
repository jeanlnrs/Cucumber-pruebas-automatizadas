package runner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;	

@RunWith(Cucumber.class)				
@CucumberOptions(features="feature",
				glue={"stepsdefinitions"},
				plugin = {"pretty", "html:target/cucumber"})
public class EjecucionDeSelenium {

}