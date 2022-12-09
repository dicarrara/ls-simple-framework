package webapp.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Interactions {

    public WebDriver driver;
    public WebDriverWait wait;

    public Interactions(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    public void click(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void collectListOfChoices(String pathOfElement){
        List<WebElement> allChoices = driver.findElements(By.xpath(pathOfElement));
        for( WebElement choice : allChoices){
            System.out.println(choice.getText());
            System.out.println("*********************************************************************");
        }
    }
}
