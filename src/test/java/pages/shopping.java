package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.Baseclass;
import genericLib.WebDriverUtilies;

public class shoppingApp  {

	@FindBy(xpath="(//a[text()=\"Shirts\"])[1]")
	private WebElement shirt;
	
	@FindBy(xpath="//a[text()=\"Polos & Knits\"]")
	private WebElement polo;
	
	@FindBy(xpath="(//a[text()=\"Oxford Blue Polo T-shirt\"])[1]")
	private WebElement oxford;
	
	@FindBy(xpath="//*[text()=\"Add to cart\"]")
	private WebElement addcart;
	
	public shopping(WebDriver driver) {
	      PageFactory.initElements(driver, this);
	}
		

	public WebElement getshirt() {
	return shirt;
	}
	public WebElement getpolo() {
		return polo;
	}
		public WebElement getoxford() {
			return oxford;
}
		public WebElement getaddcart() {
			return addcart;
		}
	public void shirt() {
			shirt.click();
	}
	public void polo() {
			polo.click();
	}
	public void oxford() {
oxford.click();
	}
	public void addcart() {
		addcart.click();
	}
}			
