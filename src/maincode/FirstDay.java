package maincode;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAYATRI\\eclipse-workspace\\qaclass930\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bishalkarki.xyz");
		
	}

}
