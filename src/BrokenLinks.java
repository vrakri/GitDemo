import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		//broken URL
		// Step 1 - is to get all urls tied up to the links using Selenium
		//Java methods will call URL's and gets you the status code
		 //if status code>400 then url is not working - > link which tied to url is broken
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		 
		//$('a[href*="soapui"]') - u conzoli css selector
 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); // ovo će nam dati url od navedenog linka
				
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection(); // da vidimo je li url broken, 
		                                                                           // pozivamo openConnection metodu i definiramo conn object
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		
		System.out.println(respCode);
		
		
		//('li[class="gf-li"] a') //zajednički css za sve linkove 
		
       //  List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
         
       
      //   for(WebElement link:links)
        	 
     //    {
       // 	String url1 = link.getAttribute("href"); // ovo će nam dati url od navedenog linka
	//			
     	//	HttpURLConnection conn1 = (HttpURLConnection)new URL(url1).openConnection(); // da vidimo je li url broken, 
     		                                                                           // pozivamo openConnection metodu i definiramo conn object
     	//	conn1.setRequestMethod("HEAD");
     	//	conn1.connect();
     	//	int respCode1 = conn1.getResponseCode();
     	//	
     	//	System.out.println(respCode1);
     	//	if(respCode1>400)
     	//	{
     	//		System.out.println("The link with the text"+link.getText()+"is broken with code"+respCode1);
     	//		Assert.assertTrue(false);
     	//	}

         
        //     }
         
         List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
         
         SoftAssert a = new SoftAssert();
         
         for(WebElement link:links)
        	 
         {
        	String url1 = link.getAttribute("href"); // ovo će nam dati url od navedenog linka
				
     		HttpURLConnection conn1 = (HttpURLConnection)new URL(url1).openConnection(); // da vidimo je li url broken, 
     		                                                                           // pozivamo openConnection metodu i definiramo conn object
     		conn1.setRequestMethod("HEAD");
     		conn1.connect();
     		int respCode1 = conn1.getResponseCode();
     		
     		System.out.println(respCode1);
     		
     		a.assertTrue(respCode1<400, "The link with the text"+link.getText()+" is broken with code "+respCode1);
     		
        
             }
         
         a.assertAll();// ovom metodom će napraviti report svih grešaka
         
	}


}
