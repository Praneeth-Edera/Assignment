package com.example.demo.bdd;





import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
				 glue = {"com.example.demo.bdd"},
				 tags = {"@tag1"},
				 plugin = {"pretty","html:target/cucumber" },
				monochrome = true
				
)				
public class LoginUIRunner {

	

}
