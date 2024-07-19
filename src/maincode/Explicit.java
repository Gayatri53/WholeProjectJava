package maincode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Explicit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAYATRI\\eclipse-workspace\\qaclass930\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		
		WebElement navLogin,txt_box_username, txt_box_password, loginButton;
		
		navLogin = driver.findElement(By.id("login2"));
		navLogin.click();
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		txt_box_username = ww.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
		txt_box_username.sendKeys("testmorning");
		txt_box_password = driver.findElement(By.id("loginpassword"));
		txt_box_password.sendKeys("test123");
		
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();
		
		
		
		

	}

}
