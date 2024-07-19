package maincode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlterHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAYATRI\\eclipse-workspace\\qaclass930\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement simpleNav, button1, confirNav, button2, textBoxNav, button3;
       

        simpleNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
        simpleNav.click();

        button1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
        button1.click();
      
        Alert alert = driver.switchTo().alert();
        alert.accept();

        confirNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")); 
        confirNav.click();
        button2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        button2.click();
       
        alert = driver.switchTo().alert();
        alert.dismiss();

        textBoxNav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
        textBoxNav.click();

        button3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
        button3.click();
       
        alert = driver.switchTo().alert();
        alert.sendKeys("QA");
        alert.accept();

       
    }
}
