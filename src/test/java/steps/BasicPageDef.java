package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {

    BasicPage basicPage = new BasicPage();

    @Then("Click link {string}")
    public void clickLink(String arg0) {
        basicPage.clickLink(arg0);
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Content {string} visible")
    public void contentVisible(String arg0) {
        basicPage.contentVisible(arg0);
    }
}
