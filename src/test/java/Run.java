import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".",
        tags = ("@BookAppointmentInCura"),
        dryRun = false,
        plugin= {"pretty","html:/target/test-summary-report.html","json:target/cucumber.json"})

public class Run {
}
