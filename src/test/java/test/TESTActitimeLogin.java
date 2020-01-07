package test;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}