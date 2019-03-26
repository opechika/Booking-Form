package io.equalexperts.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.equalexperts.helper.Helper;

public class Hook extends Helper
{
	@Before 
	public void setup() throws Exception
	{
		LaunchBrowser("chrome");
		launchUrl("http://hotel-test.equalexperts.io/");
		
	}
	
	@After
	public void teardown() throws Exception
	{
		closeBrowser();
	}

}
