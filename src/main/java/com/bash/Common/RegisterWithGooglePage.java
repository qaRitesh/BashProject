package com.bash.Common;

import java.util.Map;

import com.bash.Common.OR.RegisterWithGooglePageOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class RegisterWithGooglePage extends RegisterWithGooglePageOR {

	private WebUtil gm;
	public RegisterWithGooglePage(WebUtil wd) {
		super(wd);
		this.gm=wd;
	}
	
	public void googleSignHearderText(Map<String,String> fillInformatonMap) {
		gm.VerifyInnerText(getGoogleHearderText(), fillInformatonMap.get("GoogleTextHearder"));
	}

}
