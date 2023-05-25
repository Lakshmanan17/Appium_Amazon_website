package Appium_Runner;


import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// @RunWith(Cucumber.class)
@CucumberOptions(features="Featuresfiles/Login_Amazon.feature",glue="stepDefinitions",plugin= {"pretty","html:target/cucumber"}, monochrome= true)

@Test
public class Appium_Runnerclass extends AbstractTestNGCucumberTests  {

}
