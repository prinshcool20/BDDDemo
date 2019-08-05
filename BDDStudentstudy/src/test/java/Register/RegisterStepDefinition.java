package Register;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.StudentRegistrationPageFactory;

public class RegisterStepDefinition {

	private WebDriver driver;
	private StudentRegistrationPageFactory loginPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Users\\\\chromedriver_win32\\\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on 'Registration' Page$")
	public void user_is_on_login_Page() throws Throwable {
	
		driver.get("file:///D:\\Users\\dilpkaur\\SPRING WORKSPACE\\BDDStudentstudy\\register.html");
		
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPageFactory = new StudentRegistrationPageFactory(driver);

	}
	@When("^user enters invalid Name$")
	public void user_enters_invalid_UserName() throws Throwable {
		loginPageFactory.setName("");;
		loginPageFactory.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter Name'$")
	public void display_Please_Enter_UserName() throws Throwable {
		String expectedMessage="* Please enter Name.";
		String actualMessage=loginPageFactory.getNameError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	
	}

	@When("^user enters invalid Address$")
	public void user_enters_invalid_Address() throws Throwable {
		loginPageFactory.setName("Dilpreet");
		loginPageFactory.setAddress("");
		loginPageFactory.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter Addresss'$")
	public void display_Please_Enter_Addresss() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expectedMessage="* Please enter Address.";
		String actualMessage=loginPageFactory.getAddressError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	
	}

	

	@When("^user enters invalid Marks$")
	public void user_enters_invalid_Marks() throws Throwable {
		loginPageFactory.setName("Dilpreet");
		loginPageFactory.setAddress("Chandigarh");
		loginPageFactory.setMarks("");
		loginPageFactory.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter Marks'$")
	public void display_Please_Enter_Marks() throws Throwable {
		String expectedMessage="* Please enter Marks.";
		String actualMessage=loginPageFactory.getMarksError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		
		driver.get("file:///D:\\Users\\dilpkaur\\SPRING WORKSPACE\\BDDStudentstudy\\success.html");
	}

	
}
