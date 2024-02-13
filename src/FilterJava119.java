import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class FilterJava119 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://rahulshettyacademy.com/greenkart/#/offers"); //- ne radi 500
			
			driver.findElement(By.id("search-field")).sendKeys("Rice");
			List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]")); // zajednički xpath za sve nazive u stupcu
			//5 results will be in veggies list
			List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
			collect(Collectors.toList());
			//1 result will be in filtered list
			Assert.assertEquals(veggies.size(), filteredList.size());
			
	}
		

}
