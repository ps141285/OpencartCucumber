package StepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources", // Path to the feature file
        glue = "StepDefinition",                     // Path to step definitions package
        dryRun = false,
        plugin = {"pretty", "html:test-output"}, // Report plugins
        monochrome = true                             // Makes console output readable
)
public class TestRunner
{
}
