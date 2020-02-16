package Com.TUI;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\Resources\\Search.feature",tags = "@SmokeTestCases"
)
public class Runcuketest {
}
