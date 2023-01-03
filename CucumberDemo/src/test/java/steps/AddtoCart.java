package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AddtoCart {
    ChromeDriver driver;
    
    @Given("User is on Chrome Browser and is able to access ecommerce webpage")
    public void i_am_on_ecomm_Homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:80/ecomm/");
    }

    @Given("User click on Add to Cart button")
    public void i_click_on_addtocart_button() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='cart-area']/child::*")).click();
    }

    @Then("Check if Checkout button is clickable or not")
    public void i_click_on_checkout_button() throws InterruptedException {
      
        
        Thread.sleep(3000);
        WebElement e1= driver.findElement(By.xpath("//div[@class='checkout-btn mt-100']/child::*"));
        JavascriptExecutor js = ((JavascriptExecutor)driver);

        js.executeScript("arguments[0].scrollIntoView(true);", e1);
    	
    	Thread.sleep(2000);
    	
       e1.click();

    }
    
    @Then("Check if Checkout page is displayed or not")
    public void i_am_on_Checkout_Page() {
        
        String title = driver.getTitle();
        
        System.out.println(title);
    }

    @And("Enter the values to fill up the Billing address")
    public void i_enter_billing_address() {
        
          driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[1]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[1]"))
            .sendKeys("John");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[2]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[2]"))
            .sendKeys("Carlos");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[3]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[3]"))
            .sendKeys("Simplilearn");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[4]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[4]"))
            .sendKeys("House no 1");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[5]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[5]"))
            .sendKeys("address2");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[6]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[6]"))
            .sendKeys("1203045");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[7]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[7]"))
            .sendKeys("town1");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[8]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[8]"))
            .sendKeys("provience1");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[9]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[9]"))
            .sendKeys("234567890");
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[10]")).clear();
            driver.findElement(By.xpath("(//div[@class='col-12 col-md-6'])[1]/descendant::input[10]"))
            .sendKeys("carlos@gmail.com");
        
        
    }

    @Then("Click on Place order button")
    public void click_on_place_order_button() {
       driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/a")).click();
       
    }

}
