package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs4 {
	WebDriver driver;


@Given("the URL of The Demo Web Shop {string}")
public void the_URL_of_The_Demo_Web_Shop(String url) {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize(); 
}

@When("User Enters {string} as Username")
public void user_Enters_as_Username(String string) {
	driver.findElement(By.name("userName")).sendKeys("mounika1");
}

@When("User Enters {string} as passWord")
public void user_Enters_as_passWord(String string) {
	driver.findElement(By.id("password")).sendKeys("mounika");
}

@Then("User Clicks on login Button")
public void user_Clicks_on_login_Button() {
	driver.findElement(By.xpath("//input[@name='Login']")).click();	
}

@Then("clicks on Search bar")
public void clicks_on_Search_bar() {
	driver.findElement(By.id("myInput")).sendKeys("head");
}

@Then("click on Finddetails")
public void click_on_Finddetails() {
	driver.findElement(By.xpath("//form//input[@name='val']")).click();
}

@Then("displays That Product details")
public void displays_That_Product_details() {
	Assert.assertTrue(driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).isDisplayed());
  
}

@Then("try to Click on proceed")
public void try_to_Click_on_proceed() {
	driver.findElement(By.xpath("//form[2]//input[1]")).click();
	System.out.println("proceed is not avaliable");
}
}
