package selenium_demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {
	public static void main(String [] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mimni\\eclipse-workspace\\demo\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.homedepot.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.close();
    
    
	
}
}