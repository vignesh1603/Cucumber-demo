package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\Demo.feature",
                  glue="com.telecom.stepdefinition",
                  monochrome=true,
                  dryRun=false,
                  plugin="html:target",
                  tags="@hardcoded")
public class TestRunner {
	
	

}
