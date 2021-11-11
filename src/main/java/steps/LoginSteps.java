package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @Given("I navigate to LoginPage")
    public void i_navigate_to_login_page() {
        impl.navToLoginPage();
    }

    @When("I input {string} as {string}")
    public void i_input_as(String inputUser, String value) {
        impl.fillInput(inputUser, value);
    }

    @When("I click Login button")
    public void i_click_login_button() {
        impl.getPage().loginBtn.click();
    }

    @Then("Title of the page should be Home Page")
    public void title_of_the_page_should_be_home_page() {
        Assert.assertEquals("Home Page", WebDriverUtils.getDriver().getTitle());
        WebDriverUtils.quitDriver();
    }

    @Then("I should see error message")
    public void i_should_see_error_message() {
        Assert.assertEquals("Incorrect username/password", impl.getPage().errorMsg.getText());
        WebDriverUtils.quitDriver();
    }

}
