package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitionTestNG_GreenCard {
    @Given("^User is on GreenCart Landing Page$")
    public void user_is_on_green_cart_landing_page() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dariia\\Documents\\drivers\\chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
        System.out.println("User is on GreenCart Landing Page");
    }
    @When("^user searched with short name {string} and extracted actual name of product$")
    public void user_searched_with_short_name_and_extracted_actual_name_of_product(String string) {
        System.out.println("user searched with short name {string} and extracted actual name of product");
    }
    @Then("^User searched for same shortname in offers page to check if product exist$")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist() {
        System.out.println("User searched for same shortname in offers page to check if product exist");
    }


}
