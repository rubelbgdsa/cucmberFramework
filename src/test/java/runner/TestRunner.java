package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "stefDef", plugin = { "pretty",
		"html:allure-reports", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm" }, monochrome = true)

public class TestRunner {

}




