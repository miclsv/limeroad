package com.POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBaseClass;


public class Men extends TestBaseClass {
	public Men()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//div[@class='loaderCat viptshirtLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement Tshirt;
	
	@FindBy(xpath="//img[@alt='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath="//img[@alt='Jeans']")
	private WebElement jeans;
	
	@FindBy(xpath="//img[@alt='Trousers']")
	private WebElement trousers;
	
	@FindBy(xpath="//img[@alt='Ethnic Sets']")
	private WebElement ethnic;
	
	@FindBy(xpath="//img[@alt='Footwear']")
	private WebElement footwear;
	
	@FindBy(xpath="//img[@alt='Kids']")
	private WebElement kids;
	
	@FindBy(xpath="//img[@alt='Home']")
	private WebElement home;
	
	@FindBy(xpath="//img[@alt='My Feed']")
	private WebElement myFeed;
	
	@FindBy(xpath="//div//span/img")
	private List<WebElement> styles;
	
	@FindBy(xpath="//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll']")
	private List<WebElement> products;

	@FindBy(xpath="//div[@id='alSz']//span[text()=' M ']")
	private WebElement sizeM;
	
	@FindBy(xpath="//span[text()=' 9 (UK) ']")
	private WebElement sizeL;
	
	@FindBy(xpath="//div[@id='alSz']//span[text()=' XL ']")
	private WebElement sizeXL;
	
	@FindBy(xpath="//div[@id='alSz']//span[text()=' 2XL ']")
	private WebElement size2XL;

	//div[@data-pgn='Add to Cart']
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement addToCart;
	
	//select
	
	@FindBy(xpath="//select")
	private WebElement nos;
	
	@FindBy(xpath="//a[text()='BUY NOW']")
	private WebElement buy;
	
	@FindBy(css="[autocomplete='tel-national']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//input[@type='submit'][@value='GET OTP']")
	private WebElement getOTP;
	
	@FindBy(xpath="//input[@type='submit'][@value='GET OTP'][contains(@class,'inSuc')] ")
	private WebElement readyForGetOTP;
	

	@FindBy(xpath="//input[@type='submit'][@value='GET OTP'][contains(@class,'inErr')] ")
	private WebElement notReadyGetOTP;


	public WebElement getTshirt() {
		return Tshirt;
	}


	public WebElement getShirts() {
		return shirts;
	}


	public WebElement getJeans() {
		return jeans;
	}


	public WebElement getTrousers() {
		return trousers;
	}


	public WebElement getEthnic() {
		return ethnic;
	}


	public WebElement getFootwear() {
		return footwear;
	}


	public WebElement getKids() {
		return kids;
	}


	public WebElement getHome() {
		return home;
	}


	public WebElement getMyFeed() {
		return myFeed;
	}


	public List<WebElement> getStyles() {
		return styles;
	}


	public List<WebElement> getProducts() {
		return products;
	}


	public WebElement getSizeM() {
		return sizeM;
	}


	public WebElement getSizeL() {
		return sizeL;
	}


	public WebElement getSizeXL() {
		return sizeXL;
	}


	public WebElement getSize2XL() {
		return size2XL;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getNos() {
		return nos;
	}


	public WebElement getBuy() {
		return buy;
	}


	public WebElement getMobileNo() {
		return mobileNo;
	}


	public WebElement getGetOTP() {
		return getOTP;
	}


	public WebElement getReadyForGetOTP() {
		return readyForGetOTP;
	}


	public WebElement getNotReadyGetOTP() {
		return notReadyGetOTP;
	}
	
	
	////input[@id='modify_for_ctob']
	
	
	
	
}
