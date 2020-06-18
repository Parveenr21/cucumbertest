package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Here package name for Step definition file but feature file needs path
@CucumberOptions(features="src/test/java/Feature/Login.feature",
        glue="StepDefinition",
        dryRun = false,
        monochrome = true,
        strict = true,
        plugin = {"pretty","html:target/HTMLreport","json:target/reportJSON.json"},

snippets = SnippetType.UNDERSCORE)


public class TestRunner1 {





}
