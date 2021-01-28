package com.cucumber.junit.driver.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage{

    public static WebDriver driver;
    private static final String CUCUMBER_IO_URL = "https://cucumber.io/";
    private static final String TEXT_PATTERN = "%s[contains(text(),'%s')]";
    private static final String MENU_SECTION = "//*[contains(@class,'nav-link')]";
    private static final String CHILD_MENU_OPTION = "//*[contains(@class,'dropdown')]//*[contains(@class,'item')]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CUCUMBER_IO_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(String.format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }

    public WebElement menuChildItem(String linkText) {
        return findElement(By.xpath(String.format(TEXT_PATTERN, CHILD_MENU_OPTION, linkText)));
    }
}
