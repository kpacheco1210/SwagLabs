package runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import seleniumgluecode.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue = {"seleniumgluecode"},
    features = "src/test/java/features",
    tags = "",
    plugin = {"pretty", "html:target/cucumber.html"},
    snippets = CAMELCASE
)
public class TestRunner extends Hooks {
}
