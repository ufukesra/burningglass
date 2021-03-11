package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = "",
        glue = "stepDefinitions",
        features = "src/test/resources/features",
        //tags = "",
        dryRun = false
)

public class CukesRunner {
}
