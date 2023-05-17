package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        stepNotifications = true, tags = "@RegTest"
//        tags = "not @RegTest" - run all except RegTest
        //        tags = "@RegTest or @SmokeTest"
        //        tags = "@RegTest and @SmokeTest"
)

public class TestRunner {
}