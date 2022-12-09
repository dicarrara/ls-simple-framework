package webapp.homepage;
import webapp.tools.Interactions;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public Factory elements;
    public Interactions interactions;
    public Constants constants;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
        this.interactions = new Interactions(driver);
        this.constants = new Constants();
    }

    public void clickContactButton(){
        interactions.click(elements.contactButton);
    }

    public void clickSolutionDropDown (){
        interactions.click(elements.solutionsDropDown);
    }

    public void clickMarketplaceButton (){
        interactions.click(elements.marketplaceButton);
    }

    public void collectListOfSolutions(){
        interactions.collectListOfChoices(constants.SOLUTIONS_CHOICES_XPATH);
    }

}
