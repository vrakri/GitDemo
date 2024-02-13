import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;





public class opdatedropdown {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://corporate.spicejet.com");
			
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
			
		//.ui-state-default.ui-state-highlight.ui-state-active - locator za označeni datum
		
		//enable/disable element
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	    
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
	    	System.out.println("its enabled");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    
		// count the number of checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
        driver.findElement(By.id ("divpaxOptions")).click();
        Thread.sleep(2000L);
        
       int i=1;
       	while (i<4)
        			
        { 
        	driver.findElement(By.id("adultDropdown")).click();//3 times, mijenjao se dropdown na stranici, umjesto + za povećavanje broja putnika, sada je novi dropdown sa brojevima
        	i++;
        
        		}
        
        //System.out.println(driver.findElement(By.id ("divpaxOptions")).getText());	
        
		//for(int =1; i<4;i++)
       
      //  {
        	//driver.findElement(By.id("hrefIncAdt")).click();
        	
      //  }
	
      //driver.findElement(By.id("btnclosepaxoption")).click();
		
		//System.out.println(driver.findElement(By.id ("divpaxOptions")).getText());
		
		
		
			
	}
		}