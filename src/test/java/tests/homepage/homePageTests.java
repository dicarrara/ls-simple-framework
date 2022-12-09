package tests.homepage;

import org.testng.Assert;
import org.testng.annotations.Test;
import webapp.ManagerForTests;

public class homePageTests extends ManagerForTests {

    @Test
    public void test01_verifyContactUs(){
        homePage.clickContactButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://loan-street.com/contact/");
    }

    @Test
    public void test02_solutionDropDown() throws InterruptedException {
        homePage.clickSolutionDropDown();
        homePage.collectListOfSolutions();
        homePage.clickMarketplaceButton();
        Assert.assertTrue(factory.marketplaceHeader.isDisplayed());

    }
}
