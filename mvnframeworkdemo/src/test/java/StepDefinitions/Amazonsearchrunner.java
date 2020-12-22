package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonsearchrunner 
{
	@Given("the user is already on searchbox at home page")
	public void the_user_is_already_on_searchbox_at_home_page() {
	    System.out.println("user on search box");
	}

	@When("user enters product {string} and press enter")
	public void user_enters_product_and_press_enter(String string) {
		System.out.println("watches");
	}

	@Then("watches should be displayed")
	public void watches_should_be_displayed() {
		System.out.println("watches with their price should be displayed");
	}

}
