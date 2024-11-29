package com.bash.LoingPage.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bash.Common.OR.CommonClassOR;
import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class LoginPageOR extends CommonClassOR{

	public LoginPageOR(WebUtil wd) {
		super(wd);
		PageFactory.initElements(wd.getDriver(), this);		
	}
	
	@FindBy(xpath = "//button[@value='google']")
	private WebElement googleBT;
	
	@FindBy(xpath = "//button[@value='google']")
	private WebElement appleBT;
	
	@FindBy(xpath = "//button[@value='facebook']")
	private WebElement facebookBT;
	
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElement emailORPhoneNumber;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement SignInBT;
	
	@FindBy(xpath="//a[text()=\"Forgot password?\"]")
	private WebElement forgotPasswordBT;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	private WebElement registarBT;
	
	
}
