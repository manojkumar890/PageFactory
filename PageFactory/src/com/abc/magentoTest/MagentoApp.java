package com.abc.magentoTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObject.Login;
import com.abc.magentoObject.Logout;
import com.abc.magentoObject.Main;
public class MagentoApp {

	public static void main(String[] args) throws Exception {
		
		String url="https://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		Main m = new Main(driver);
		m.cilckOnMyAcc();
		Thread.sleep(3000);
		
		Login l = new Login(driver);
		l.typeEmail("subramanyaraj87@gmail.com");
		l.typePwd("Welcome123");
		l.clickOnLogin();
		Thread.sleep(3000);
		
		Logout logout = new Logout(driver);
		logout.cilckOnLogout();
		Thread.sleep(30000);
		
		driver.quit();
	}
}
