import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @cucumber.api.java.en.Then("I see that element")
    public void iSeeThatElement() {

    }

    @When("I am on x page")
    public void iAmOnXPage() {
    }

    @When("I am on {string} page")
    public void iAmOnPage(String arg0) {

    }

    @And("I press button with id {string}")
    public void iPressButtonWithId(String arg0) {
    }
}
