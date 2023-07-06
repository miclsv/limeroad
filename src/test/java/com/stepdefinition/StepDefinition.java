


package com.stepdefinition;
import com.POM.*;
import com.BaseClass.TestBaseClass;
import com.POM.HomePage;
import com.POM.Men;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends TestBaseClass {
	
	
	
	@Given("User launch the url {string}")
	public void user_launch_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//getDriver("chrome");
		goToURL(string);
	}
	@Given("User click on shop men")
	public void user_click_on_shop_men() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    wait(2);
	    clickElement(PageObjectManager.getPOM().getHome().getMen_btn());
	   
	}
	

	
	@Given("User click on T-shirt")
	public void user_click_on_t_shirt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	  
	    explicitWait(20,"clickable",PageObjectManager.getPOM().getMen().getTshirt());
	   clickElement(PageObjectManager.getPOM().getMen().getTshirt());
	    
	}
	

	@When("Choose the fisrt model")
	public void choose_the_fisrt_model() {
	    // Write code here that turns the phrase above into concrete actions
		wait(3);
	    clickElement(PageObjectManager.getPOM().getMen().getStyles().get(0));
	}



	
	@Given("User click on first product")
	public void user_click_on_first_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wait(3);
		driver.navigate().refresh();
		clickElement(PageObjectManager.getPOM().getMen().getProducts().get(0));
	}
	@When("Select size")
	public void select_size() {
	    // Write code here that turns the phrase above into concrete actions
		wait(3);
		clickElement(PageObjectManager.getPOM().getMen().getSizeL());
	}
	@Then("Add to Cart")
	public void add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		
		wait(2);
		clickElement(PageObjectManager.getPOM().getMen().getAddToCart());
	}



	

}
