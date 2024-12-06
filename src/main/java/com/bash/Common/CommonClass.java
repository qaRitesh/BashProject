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
	
	public void menTypeProductsShow(Map<String,String> maptestcaseData) {
		gm.mousemoverToElement(getHomePagetoMenTypeProduct());
		for(int i=0;i<=getHomePageTypesProducts().size()-1;i++) {
				WebElement	oneitem=getHomePageTypesProducts().get(i);
			String	itemText=oneitem.getText();
			if(itemText.equalsIgnoreCase(maptestcaseData.get("ProductTypes"))) {			
				gm.clickButton(oneitem);
				break;
			}
			
		}
		
	}
}
