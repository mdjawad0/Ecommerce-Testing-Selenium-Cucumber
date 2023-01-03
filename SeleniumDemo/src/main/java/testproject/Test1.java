package testproject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Test1 extends TestBase{    
    @Test
    public void HomepageTest() throws InterruptedException
    {
        TestBase testBase = new TestBase();
		testBase.OpenBrowser();
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath("//div[@class='classynav']/descendant::a[17]"));
        actions.moveToElement(target).perform();
        Thread.sleep(1500);
        driver.findElement(By.linkText("Contact")).click();
        Thread.sleep(2500);
        driver.switchTo().alert().accept();
//        Alert a= driver.switchTo().alert();
//        a.accept(); 
        Thread.sleep(2500);
    }
}
