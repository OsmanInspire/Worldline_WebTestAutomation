package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PurchasePage;
import pages.PurchasePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PurchasePageStepDefinitions {
    PurchasePage purchasePage = new PurchasePage();

    @Given("User opens the given link")
    public void userOpensTheGivenLink() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("User verify the Dashboard is opened")
    public void userVerifyTheDashboardIsOpened() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(purchasePage.VerifyDashboard());
    }

    @Given("User go to the sign in and click")
    public void user_go_to_the_sign_in_and_click() {
        purchasePage.signIn.click();
    }

    @Given("User enters email and password")
    public void user_enters_email_and_password() {
        purchasePage.inputEmail.sendKeys("bailie50@atmodule.com");
        purchasePage.continueButton.click();
        purchasePage.inputPassword.sendKeys("testUser123");
        purchasePage.submitButton.click();
    }

    @When("User enter {string} in search bar")
    public void user_enter_in_search_bar(String item) {
        purchasePage.searchBar.sendKeys(item);

    }

    @Given("User click at search button")
    public void user_click_at_search_button() {
        purchasePage.searchButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("User verify {string} on search page")
    public void user_verify_on_search_page(String item) {
        String actualMessage = purchasePage.verifySearchPage.getText();
        Assert.assertEquals("Verify Message", item, actualMessage);

    }

    @When("User add it on the cart")
    public void user_add_it_on_the_cart() {
        purchasePage.productLink.click();
        BrowserUtils.waitFor(2);
        purchasePage.addToCart.click();
    }

    @Then("User validate the content of the cart to ensure the correct article has been added")
    public void user_validate_the_content_of_the_cart_to_ensure_the_correct_article_has_been_added() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(purchasePage.getPrice(), purchasePage.verifyItemInfo());
    }

    @And("User go to the cart")
    public void userGoToTheCart() {
        purchasePage.cart.click();
    }

    @And("User close subtotal cart")
    public void userCloseSubtotalCart() {
        BrowserUtils.waitFor(3);
        purchasePage.cartSubtotal.click();
        BrowserUtils.waitFor(3);
    }

    @When("User delete item from cart")
    public void userDeleteItemFromCart() {
        purchasePage.deleteItemFromCart.click();
    }

    @Then("User verify the main page is opened")
    public void userVerifyTheMainPageIsOpened() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(purchasePage.VerifyDashboard());
    }
}
