package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs1 {
	WebDriver driver;
  @Given("The URL of the Test me app {string}")
   public void the_URL_of_the_Test_me_app(String url) {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize(); 
    }
	@When("User enters {string} as UserName")
	public void user_enters_as_UserName(String string) {
		driver.findElement(By.name("userName")).sendKeys("mounika1");
	}

	@When("User enters {string} as FirstName")
	public void user_enters_as_FirstName(String string) {
		driver.findElement(By.id("firstName")).sendKeys("mouni");
	}

	@When("User enters {string} as LastName")
	public void user_enters_as_LastName(String string) {
		driver.findElement(By.id("lastName")).sendKeys("ch");
	}

	@When("User enters {string} as Password")
	public void user_enters_as_Password(String string) {
		driver.findElement(By.id("password")).sendKeys("mounika");
	}

	@When("User enters {string} as ConfirmPassword")
	public void user_enters_as_ConfirmPassword(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("mounika");
	}

	@When("User enters {string} as Gender")
	public void user_enters_as_Gender(String string) {
		driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
	}

	@When("User enters {string} as EmailAddress")
	public void user_enters_as_EmailAddress(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("mounika@gmail.com");
	}

	@When("User enters {string} as MobileNumber")
	public void user_enters_as_MobileNumber(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	}

	@When("User enters {string} as Dob")
	public void user_enters_as_Dob(String string) {
		driver.findElement(By.xpath("(//input[@id='dob'])")).sendKeys("27/01/1996");
	}

	@When("User enters {string} as Address")
	public void user_enters_as_Address(String string) {
		driver.findElement(By.id("address")).sendKeys("bangalore");
	}

	@When("User enters {string} as SecurityQuestion")
	public void user_enters_as_SecurityQuestion(String string) {
		Select sq= new Select(driver.findElement(By.id("securityQuestion")));
		sq.selectByValue("411010");
	}

	@When("User enters {string} as Answer")
	public void user_enters_as_Answer(String string) {
		driver.findElement(By.id("answer")).sendKeys("gudur");
	}
	@Then("clicks on Submit ButtoN")
	public void clicks_on_Submit_ButtoN() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	
}