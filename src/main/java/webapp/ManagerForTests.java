package webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import webapp.homepage.Factory;
import webapp.homepage.HomePage;

public class ManagerForTests {
    private final String BaseURL = "https://loan-street.com";
    public WebDriver driver;
    public HomePage homePage;
    public Factory factory;

    @BeforeMethod
    public void prepareTests(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(BaseURL);
        homePage = new HomePage(driver);
        factory = new Factory(driver);
    }

    @AfterMethod
    public void terminateDriver(){
        driver.quit();
    }
}
