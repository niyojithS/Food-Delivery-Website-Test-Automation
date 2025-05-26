package Runners;

import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/Features/2_Login_Page.feature",
				"src/test/resources/Features/4_MenuExplore.feature",
				"src/test/resources/Features/5_Cart&PaymentPage.feature"},
		glue = "StepDefinition",
		plugin = {"pretty","html:target/cucumber_reports"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE)
@Test
public class TestRunner extends AbstractTestNGCucumberTests{
}