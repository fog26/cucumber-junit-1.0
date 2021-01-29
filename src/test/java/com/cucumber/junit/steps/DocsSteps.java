package com.cucumber.junit.steps;

import com.cucumber.junit.driver.pages.DocsPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DocsSteps {

    private DocsPage docsPage = new DocsPage();

    @Then("there is {int} items in the let-side menu")
    public void verifyLeftSideMenuSize(int expectedSize) {
        assertThat(docsPage.getMenuItemTitles())
                .as("The left-side of the menu size is not as expected")
                .hasSize(expectedSize);
    }

    @Then("left-side menu contain the following links")
    public void verifyLeftSideMenuContainTheFollowingLinks(List<String> expectedTitles) {
        assertThat(docsPage.getMenuItemTitles())
                .extracting(WebElement::getText)
                .as("Some of the left-side menu items names are not as expected")
                .containsAll(expectedTitles);
    }
}
