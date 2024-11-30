package com.bash.Common;

import java.util.Map;

import com.bash.Common.OR.RegisterWithApplePageOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class RegisterWithApplePage extends RegisterWithApplePageOR {

	private WebUtil gm;
	public RegisterWithApplePage(WebUtil wd) {
		super(wd);
		this.gm=wd;
	}
	
	public void logoAppleText(Map<String,String> fillInformatonMap) {
		gm.VerifyInnerText(getAppleHearderText(), fillInformatonMap.get("AppleTextHearder"));
	}

}
