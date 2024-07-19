package maincode;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondday {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAYATRI\\eclipse-workspace\\qaclass930\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		
		WebElement navLogin,txt_box_username, txt_box_password,loginButton;
		navLogin = driver.findElement(By.id("login2"));
		navLogin.click();
		Thread.sleep(5000);
		txt_box_username = driver.findElement(By.id("loginusername"));
		txt_box_username.sendKeys("testmorning");
		txt_box_password = driver.findElement(By.id("loginpassword"));
		txt_box_password.sendKeys("test123");
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		loginButton.click();
		
		
		
		
		
	}

}
