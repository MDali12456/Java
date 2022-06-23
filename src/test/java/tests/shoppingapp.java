package tests;

import genericLib.Baseclass;
import pages.shopping;


import org.testng.annotations.Test;


public class shoppingapp extends Baseclass {

	@Test
	public void shoppingappt() {
shopping sp=new shopping(driver);
	sp.getshirt().click();
	}
}