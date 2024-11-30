
package com.bash.Common.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class RegisterWithApplePageOR {

	
	public RegisterWithApplePageOR(WebUtil wd) {
		PageFactory.initElements(wd.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='ac-localnav-title']/span")
	private WebElement AppleHearderText;
}
