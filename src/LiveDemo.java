import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LiveDemo {

	public static <WebElemet> void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers"); //- ne radi 500
		
		//click on column on a web table
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webelements into list
		List<WebElement> elementList = driver.findElements(By.xpath("tr/td[1]"));
		//capture text of all webelements into new list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort in the list of steo 3 -> sorted list
	    List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		// kada želimo ispisati cijenu vezanu uz pojedinu karticu u tabeli..imam dva stupca, i jednom je naziv, u drugom cijena
		
		//scan the name column with getText ->Beans->print the price of Beans when you don't have to go to the next page
		
		List<String> price = elementList.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggie1(s)).collect(Collectors.toList());
				
		price.forEach(a->System.out.println(a));
	}

	private static String getPriceVeggie1(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue; 
		
		
		//-----------------------------------------------
		//scan the name column with getText ->Rice->print the price of Rice when you have to go to the next page
		        List<String> price;
		      do
		        {
		    	  List<WebElement> rows = driver.findElements(By.xpath("tr/td[1]"));
				price  = rows.stream().filter(e->e.getText().contains("Rice")).
				map(e->getPriceVeggie(e)).collect(Collectors.toList());
				
				if(price.size()<1)
				
				{
					driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				}
		        }while (price.size()<1);
				
			}

			private static String getPriceVeggie(WebElement s) {
				// TODO Auto-generated method stub
				String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
				return pricevalue; 
				
		
		
		
	}

}
