//package stepDefinitions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
//
//import java.util.List;
//
//@RunWith(Cucumber.class)
//public class stepDefinitionJUnit {
//    @Given("^User is on NetBanking landing page$")
//    public void user_is_on_net_banking_landing_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("User is on NetBanking landing page");
//    }
//    @When("^User login into application with username and password$")
//    public void user_login_into_application_with_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("User login into application with username and password");
//    }
//    @Then("^Home page is populated$")
//    public void home_page_is_populated() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Home page is populated");
//    }
//    @Then("^Cards are displayed$")
//    public void cards_are_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Cards are displayed");
//    }
//
//    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void user_login_into_application_with_username_and_password(String username, String password) {
//        System.out.println("User login into application with username " + username + " and password " + password);
//    }
//
//    @When("^User sign up with following details:$")
//    public void user_sign_up_with_following_details(DataTable data) throws Throwable{
//        List<List<String>> obj = data.asLists();
//        // row 0, column 0
//        System.out.println(obj.get(0).get(0));
//        // row 0, column 1
//        System.out.println(obj.get(0).get(1));
//        System.out.println(obj.get(0).get(2));
//        System.out.println(obj.get(0).get(3));
//        System.out.println(obj.get(0).get(4));
//    }
//
//
//}
