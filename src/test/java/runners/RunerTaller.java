package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "src/test/java/definition",
        features = "src/test/resources/features/taller.feature",
        tags = "@HUtaller",
        snippets = SnippetType.CAMELCASE)
public class RunerTaller {




}
