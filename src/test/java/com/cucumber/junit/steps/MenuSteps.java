package com.cucumber.junit.steps;

import com.cucumber.junit.driver.pages.DocsPage;
import com.cucumber.junit.driver.pages.HomePage;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {

    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();

    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user click on the {string} tab")
    public void clickOnTab(String tab) {
        homePage.menuSection(tab).click();
    }

    @When("the user click on the {string} option")
    public void clickOnOption(String option) {
        homePage.menuChildItem(option).click();
    }

    @When("page with title {string} should be displayed")
    public void verifyPageTitlePresence(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
                .overridingErrorMessage("Page with title '%s' is not displayed", pageTitle)
                .isTrue();
    }
}
