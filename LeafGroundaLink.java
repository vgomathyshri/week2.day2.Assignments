package selenium.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundaLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Take me to dashboard
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Dashboard")) {
			System.out.println("Dashboard Title is displayed");
		}
		driver.navigate().back();
		//Find my Destination
		String attribute = driver.findElement(By.xpath("//h5[text()='Find my destination']/following::a")).getAttribute("href");
		System.out.println(attribute);
		//Am I a broken link
		driver.findElement(By.xpath("//h5[text()='Am I broken link?']/following::a[text()='Broken?']")).click();
		String title2 = driver.getTitle();
		if (title2.contains("Error 404")) {
			System.out.println("It is a Broken Link");
		}
		driver.navigate().back();
		Thread.sleep(4000);
		//Duplicate link 
		driver.findElement(By.xpath("//h5[text()='Duplicate Link']/following::a[contains(@href,'/dashboard.xhtml')]")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		if (title.equals(title3)) {
			System.out.println("Yes it is a Duplicate Link");
		}
		//How many links in this page
		driver.navigate().back();
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(noOfLinks.size());
		
		
		//How many links in this layout
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println(findElements.size());
		
		driver.close();
		
		
	}	

}
