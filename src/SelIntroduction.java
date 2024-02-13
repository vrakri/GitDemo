import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
        // Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//safari - SafariDriver -> Methods close get
		// WebDriver methods + class methods
		
	//chromedriver.exe -> Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");
		
		//webdriver.chrome.driver ->value of path
				
		//webdriver.chrome.driver -> C:\Program Files\chromedr\chromedriver.exe
	    WebDriver driver = new ChromeDriver();
	
	
	//Firefox 	
	//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Gecko32\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	    
		WebDriver driver1 = new FirefoxDriver(options);
	
	//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriv\\msedgedriver.exe");
		
		EdgeDriverOptions options1= new EdgeOptions();
		options1.setBinary("C:\\Program Files(x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		
		WebDriver driver2 = new EdgeDriver(options1);
		
	//C:\Program Files\edgedriv\msedgedriver.exe
		
		
	driver.get("https://rahulshettyacademy.com");
	System.out.println (driver.getTitle());
	System.out.println (driver.getCurrentUrl());
	driver.close();
	driver.quit();
	
	}

}
