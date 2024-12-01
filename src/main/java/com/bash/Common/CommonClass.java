package com.bash.Common;

import java.util.Map;

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
	
	public void newRegiterBT() {
		
	}
}
