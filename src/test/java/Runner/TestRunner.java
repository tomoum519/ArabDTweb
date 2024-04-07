package Runner;

import Test.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Feature", glue = {"StepDefinitions"},
plugin = {"pretty","html:target/cucumber-html-report",
		"html:target/cucumberReports/cucumber-pretty.html",
        "json:target/cucumberReports/cucumber-TestReport.json",
        "rerun:target/cucumberReports/rerun.txt",
        "junit:target/cucumberReports/cukes.xml",}
//,tags = "@tag1"
)
public class TestRunner extends TestBase {

}


