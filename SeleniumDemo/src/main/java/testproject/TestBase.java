package testproject;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager; 
public class TestBase {
	ChromeDriver driver;
    @BeforeClass
    public void OpenBrowser()
    {
    	WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://localhost:80/ecomm/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));    
    }
    @AfterClass
    public void CloseBrowser()
    {
        driver.quit();
    }
}
