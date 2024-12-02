package com.bash.Common.OR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class CommonClassOR {

	public CommonClassOR(WebUtil wd) {
		PageFactory.initElements(wd.getDriver(), this);		
	}
	
	
	@FindBy(xpath ="//span[text()='Sign In']")
	private WebElement signInBT;
	
	@FindBy(xpath ="//span[text()='RK']")
	private WebElement signInUsername;
	
	@FindBy (xpath="//span[@class='thefoschini-vtex-tfg-custom-components-1-x-departmentPillsItemLabel' and text()='Women']")
	private WebElement WomenTypeProducts;
	
	@FindBy(xpath="//span[@class='thefoschini-vtex-tfg-custom-components-1-x-departmentPillsItemLabel' and text()='Men']")
	private WebElement MenTypeProducts;
	@FindBy(xpath="//div[contains(@class,'thefoschini-vtex-tfg-custom-components-1-x-departmentPillsDropdown')]//a[contains(@class,'thefoschini')]")
	private List<WebElement> MenProducts;
}
