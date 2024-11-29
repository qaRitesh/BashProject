package com.bash.Register;

import java.util.Map;

import com.bash.Register.OR.RegisterPageOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class RegisterPage extends RegisterPageOR {

	private WebUtil gm;

	public RegisterPage(WebUtil wd) {
		super(wd);
		this.gm = wd;
	}

	// googlefromRegister:
	public void googleFromRegister() {
		gm.clickButton(getGoogleBaseRegister());
	}

	// faceBookfromRegister:
	public void faceBookfromRegister() {
		gm.clickButton(getFaceBookBaseRegister());
	}

	// applefromRegister:
	public void applefromRegister() {
		gm.clickButton(getAppleBaseRegister());
	}

	// InforatinfromRegister:
	public void fillInformationRegisterDatiles(Map<String,String> fillInformatonMap) {
		
		gm.inputData(getEmail(),fillInformatonMap.get("Email") );
		gm.inputData(getPassword(),fillInformatonMap.get("Password") );
		gm.inputData(getFirstName(),fillInformatonMap.get("First Name") );
		gm.inputData(getLastName(),fillInformatonMap.get("Last Name") );
		gm.CheckBoxClick(getYesLastestdealsCB());
		gm.switchToframeByWebElement(getIFrameRobotBT());

		//gm.clickButton(getCheckRobotCB());
		gm.javascriptClick(getCheckRobotCB());
		gm.switchToFramedefaultContent();
		//gm.clickButton(getRegisterProfileBT());
	}

}
