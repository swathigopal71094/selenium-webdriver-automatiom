package Runnerclasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/mvnframeworkdemo/src/test/java/com/guru99/pageObjects/search.feature"
 ,glue={"StepDefinitions"},
 plugin = {"pretty"}
 )
public class Amazonrunnercum 

{//added method
public void say() {
	System.out.println("saying....");
}

}
