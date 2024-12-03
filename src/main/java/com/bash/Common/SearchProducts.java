package com.bash.Common;

import com.aventstack.extentreports.Status;
import com.bash.Common.OR.SearchProductsOR;
import com.tfg.bash.genericyCodes.WebUtil;

public class SearchProducts extends SearchProductsOR{

	private WebUtil gm;
	public SearchProducts(WebUtil wD) {
		super(wD);
		this.gm=wD;
	}

	
	public void totalNumProductsCount() {
	int	totalproductShowAfterSearch=gm.getfindElementCount(getNumOfTotalProductsShow());
	gm.getExtTest().log(Status.INFO,totalproductShowAfterSearch+ " Total number of products show in Screen After Searching product.");
	}
	
	
}
