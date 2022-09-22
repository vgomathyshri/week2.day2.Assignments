package selenium.week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundsSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Drop down slection
		WebElement selectElement = driver.findElement(By.xpath("//div[@class='col-12']/select"));
		
		Select dd = new Select(selectElement);
				dd.selectByVisibleText("Selenium");
				
		
		//Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')])[2]")).click();
		
		List<WebElement> cityElements = driver.findElements(By.xpath("//div[@id='j_idt87:city_panel']//li"));
		for (WebElement webElement : cityElements) {
			
			System.out.println(webElement.getText());
		}
		
		
				
		//Select Multiple valuse in a drop down		
		
				driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[text()='Appium']")).click();
				driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[text()='Selenium WebDriver']")).click();
				
		//Choose Language Randomly
				driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
				driver.findElement(By.xpath("//li[@data-label='English']")).click();	
				Thread.sleep(4000);
				driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
				driver.findElement(By.xpath("(//div[@id='j_idt87:value_panel']//li)[4]")).click();
	
	}

}
