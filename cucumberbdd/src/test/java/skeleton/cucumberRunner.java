package skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:cucumber-reports"},
		features= {"src/test/resources/skeleton/demoWebShop.feature"},
monochrome=true,dryRun=false,tags="@invalid",snippets=SnippetType.CAMELCASE)


public class cucumberRunner {

}

