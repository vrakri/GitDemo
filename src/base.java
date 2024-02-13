import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(5));  // need for explicit wait
		//driver.manage().timeouts().implicitlyWait (5,TimeUnit.SECONDS); // implicit wait
		
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		////button[normalize-space()='PROCEED TO CHECKOUT']
		
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
	
	
	}
	

              
	
private static WebDriverWait NewWebDriverWiat(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}




public static void addItems (WebDriver driver,String[] itemsNeeded)

{
	
	//h4.product-name - zajednički lokator
	//  //button[text() = 'ADD TO CART']- xpath zajednički , na temelju dijela teksta,ili kada zamijenimo text lokator, drugim:
	//  //div[@class='product-action']/button - xpath zajednički statični
	
	
//1. 	
	//driver.findElements(By.cssSelector("h4.product-name"));
	
  //  List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
//	for (int i=0; i<products.size();i++);
	//{
	//	int i = 0;
	//	String name = products.get(i).getText(); //svaki put kad se loop ponavlja dohvaća tekst proizvoda, ako ih ima 30,onda dohvaća 30 tekstova
		
	//	if (name.contains("Cucumber"))           // sada definiramo da taj tekst sadrži Cucumber
//	{
			// click on add to card
		//	driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
		//	break;
		//}
        //}
//2.definiranje array list, kada imamo više vrijednosti jedne varijable:
	
	        // deklarirali smo još jednu varijablu, da vidimo koliko puta će uću unutar ifa//i kad ide tri puta da bude break..
	  
	    //String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"}; //definiranje array, kada imamo više vrijednosti jedne varijable
	
		//driver.findElements(By.cssSelector("h4.product-name"));
		
	int j=0;
		
	    List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
   	for (int i=0; i<products.size();i++)
		{
			// Brocolli - 1 kg
			// Brocolli, 1 kg
			
			
			String[] name = products.get(i).getText().split("-"); //sa split smo odvojili tekst na dva dijela, i upotrijebili"-" kao razdijelnik
			String formattedName = name[0].trim();                // sa trim smo se riješili spacea
			
			//format it to get actual item name (kada imamo npr. cucumber - 1kg) 
			//covert array into array list for easy search, when we have complicated scenarios to validate
			//2.dio check whether name you extracted is present in array list or not
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			
			if (itemsNeededList.contains(formattedName))          // sada definiramo da taj tekst sadrži Cucumber
	       {
				j++;
				//click on add to card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==itemsNeeded.length)
					{
					break;
					}
			}
		}
	}
}
	
			
		
	
	


