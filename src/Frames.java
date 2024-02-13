import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedr/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());// da vidimo koliko je iframea na stranici
		
		driver.switchTo().frame(driver.findElement((By.cssSelector("iframe[class='demo-frame']"))));
		//driver.switchTo().frame(0); // switch to frame po indexu
		
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source= driver.findElement((By.id("draggable")));
		WebElement target = driver.findElement((By.id("droppable")));
		a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
	}

}
