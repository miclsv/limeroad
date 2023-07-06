package com.POM;
//import com.POM.*;
public class PageObjectManager  {

private static final PageObjectManager pom = new PageObjectManager();	
HomePage home;
Men men;

	private PageObjectManager()
	{
		
	}

public static  PageObjectManager getPOM()
{	
	return pom; 
}

public HomePage getHome() {
	if(home==null) {
		home = new HomePage();
	}
	return home;
}

public Men getMen() {
	if(men == null)
	{
		men = new Men();
	}
	return men;
}


}
