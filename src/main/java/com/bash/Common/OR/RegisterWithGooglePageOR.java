
package com.bash.Common.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class RegisterWithGooglePageOR {

	
	public RegisterWithGooglePageOR(WebUtil wd) {
		PageFactory.initElements(wd.getDriver(), this);
	}
	
	@FindBy(xpath="//div[text()='Sign in with Google']")
	private WebElement googleHearderText;
}
