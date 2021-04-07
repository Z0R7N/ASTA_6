package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {

    BasicPage basicPage = new BasicPage();

    @Then("Click link {string}")
    public void clickLink(String arg0) {
        basicPage.clickLink(arg0);
    }
}
