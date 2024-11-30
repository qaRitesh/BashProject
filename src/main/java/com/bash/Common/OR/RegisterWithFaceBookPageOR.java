
package com.bash.Common.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class RegisterWithFaceBookPageOR {

	
	public RegisterWithFaceBookPageOR(WebUtil wd) {
		PageFactory.initElements(wd.getDriver(), this);
	}
	
	@FindBy(xpath="//i [@class='fb_logo img sp_YbiIuPczOY_ sx_5e3428']/u")
	private WebElement FaceBookHearderText;
}
