package testcase;

import org.testng.annotations.Test;

import base.BasePage;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver dv;
  @Test
  public void f() {
	  LoginPage lp = new LoginPage(dv);
	  lp.login("testmorning", "test123");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAYATRI\\eclipse-workspace\\qaclass930\\driver\\chromedriver.exe");
	  dv = new ChromeDriver();
	  BasePage bp = new BasePage(dv);
	  bp.startbrowser("https://demoblaze.com");
	  HomePage hp = new HomePage(dv);
	  hp.click_nav_login();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
