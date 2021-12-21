package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features/UserHistory_2.feature",
        glue = {"tasks", "stepDefinitions"},
        plugin = {"json:test/report/cucumber_report.json"})

public class UserHistory_Two {
}
