package com.bash.Register.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bash.Common.OR.CommonClassOR;
import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class RegisterPageOR extends CommonClassOR {

	public RegisterPageOR(WebUtil wd) {
		super(wd);
		PageFactory.initElements(wd.getDriver(), this);
	}

	@FindBy(xpath = "//button[@value='google']")
	private WebElement GoogleBaseRegister;

	@FindBy(xpath = "//button[@value='facebook']")
	private WebElement FaceBookBaseRegister;

	@FindBy(xpath = "//button[@value='apple']")
	private WebElement AppleBaseRegister;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@name='first']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@name='last']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id=':r7:']")
	private WebElement YesLastestdealsCB;

	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	private WebElement iFrameRobotBT;
	
	@FindBy(xpath = "//span[@id='recaptcha-anchor']//div[@class='recaptcha-checkbox-border']")
	private WebElement CheckRobotCB;
	
	@FindBy(xpath = "//button[@title'Register profile']")
	private WebElement RegisterProfileBT;
	
	 @CacheLookup 
	 @FindBy(xpath = "//*[text()=\"I'm not a robot\"]") private WebElement robot;

}
