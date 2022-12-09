package webapp.homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory extends Constants{
    //create and initialize elements
    @FindBy(xpath = CONTACT_BUTTON_XPATH)
    public WebElement contactButton;

    @FindBy(xpath = SOLUTION_DROPDOWN_XPATH)
    public WebElement solutionsDropDown;

    @FindBy(xpath = MARKETPLACE_BUTTON_XPATH)
    public WebElement marketplaceButton;

    @FindBy(xpath = MARKETPLACE_HEADER)
    public WebElement marketplaceHeader;

    @FindBy(xpath = SOLUTIONS_CHOICES_XPATH)
    public WebElement solutionChoices;

    public Factory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
