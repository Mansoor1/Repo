package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\selenese\\Sel@7.30AM(est)_new\\CucumberBDD\\src\\main\\java\\features\\TS02_Login1.feature"
		,glue={"stepDefinations"}
		,dryRun=true
		,monochrome=true
		,plugin= {"pretty","json:target/myReports/report.json"
						  ,"junit:target/myReports/report.xml"}
		)
public class TestRunner {

}
