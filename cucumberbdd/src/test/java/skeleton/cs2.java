package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 public class cs2 {
	
	WebDriver driver;
	@Given("The URL of The Demo Web Shop {string}")
	public void the_URL_of_The_Demo_Web_Shop(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();    
	}

	@When("User enters {string} as Username")
	public void user_enters_as_Username(String username) {
		driver.findElement(By.name("userName")).sendKeys("mounika1");
	}
	
	@When("User enters {string} as passWord")
	public void user_enters_as_passWord(String password) {
		driver.findElement(By.id("password")).sendKeys("mounika");
	}

	@Then("User clicks on login Button")
	public void user_clicks_on_login_Button() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();	

		}
		@Then("clicks on search bar")
		public void clicks_on_search_bar() {
			driver.findElement(By.id("myInput")).sendKeys("head");
		}
		@Then("click on finddetails")
		public void click_on_finddetails() {
			driver.findElement(By.xpath("//form//input[@name='val']")).click();
		}

		@Then("displays that Product details")
		public void displays_that_Product_details() {
			Assert.assertTrue(driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).isDisplayed());
		    System.out.println("print success");
		}

 }
