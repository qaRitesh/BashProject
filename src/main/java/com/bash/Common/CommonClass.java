package com.bash.Common;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.bash.Common.OR.CommonClassOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class CommonClass extends CommonClassOR {

	private WebUtil gm;
	
	public CommonClass(WebUtil wd) {
		super(wd);
		this.gm=wd;		
	}
	
	public void userSignInBT() {
		gm.clickButton(getSignInBT());		
	}

	public void VarifySigninUserName(Map<String,String> maptestcaseData) {
		gm.VerifyInnerText(getSignInUsername(),maptestcaseData.get("Sign Username"));
	}
	
	public void womenTypeProductsShow() {
		gm.mousemoverToElement(getWomenTypeProducts());
	}
	
	public void menTypeProductsShow(String itemsName) {
		gm.mousemoverToElement(getMenTypeProducts());
		List<WebElement> menItemsType=getMenProducts();
		for(int i=0;i<=menItemsType.size()-1;i++) {
				WebElement	oneitem=menItemsType.get(i);
			String	itemText=oneitem.getText();
			if(itemText.equalsIgnoreCase(itemsName)) {
				oneitem.click();
				break;
			}
			
		}
		
	}
}
