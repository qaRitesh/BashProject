package com.bash.Common;

import java.util.Map;

import com.bash.Common.OR.RegisterWithFaceBookPageOR;
import com.tfg.bash.genericyCodes.WebUtil;


public class RegisterWithFaceBookPage extends RegisterWithFaceBookPageOR {

	private WebUtil gm;
	public RegisterWithFaceBookPage(WebUtil wd) {
		super(wd);
		this.gm=wd;
	}
	
	public void logoFaceBookText(Map<String,String> fillInformatonMap) {
		gm.VerifyInnerText(getFaceBookHearderText(), fillInformatonMap.get("FaceBookTextHearder"));
	}

}
