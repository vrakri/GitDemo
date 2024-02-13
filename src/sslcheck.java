import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		 Map<String, Object> prefs = new HashMap<String, Object>();
         prefs.put("download.default_directory", "/directory/path");
         options.setExperimentalOption("prefs", prefs);
         
		options.setAcceptInsecureCerts(true);
		//options.addExtensions(null)
        //options.setCapability("proxy", value);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
	}

}
