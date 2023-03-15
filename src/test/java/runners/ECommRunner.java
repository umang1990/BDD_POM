package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//",
		glue = {"stepDefs"}
		
		
)


public class ECommRunner extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
  }
}
