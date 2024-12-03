package com.bash.Common.OR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tfg.bash.genericyCodes.WebUtil;

import lombok.Getter;

@Getter
public class SearchProductsOR {

	
	public SearchProductsOR(WebUtil wD) {
		PageFactory.initElements(wD.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@data-testid='card']")
	private List<WebElement> numOfTotalProductsShow;
	
	
	
}
