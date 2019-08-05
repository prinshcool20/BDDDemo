package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentRegistrationPageFactory {

WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="name")
	@CacheLookup
	WebElement name;

	@FindBy(xpath="//*[@id=\"nameErrMsg\"]")
	WebElement nameError;
	
	@FindBy(xpath="//*[@id=\"addressErrMsg\"]")
	WebElement addressError;
	
	@FindBy(xpath="//*[@id=\"marksErrMsg\"]")
	WebElement marksError;


	//using how class
	@FindBy(name="address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="marks")
	@CacheLookup
	WebElement marks;


	@FindBy(className="btn")
	@CacheLookup
	WebElement loginButton;
	
	//initiating the elements
	public StudentRegistrationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getName() {
		return name;
	}

	public void setName(String name) {
		this.name.sendKeys(name);
		
	}

	public WebElement getNameError() {
		return nameError;
	}

	public void setNameError(WebElement nameError) {
		this.nameError = nameError;
	}

	public WebElement getAddressError() {
		return addressError;
	}

	public void setAddressError(WebElement addressError) {
		this.addressError = addressError;
	}

	public WebElement getMarksError() {
		return marksError;
	}

	public void setMarksError(WebElement marksError) {
		this.marksError = marksError;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks.sendKeys(marks);;
	}

	public void setLoginButton() {
		this.loginButton.click();
		}

}
