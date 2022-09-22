package selenium.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundsRadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Your most favorite browser
		driver.findElement(By.xpath("(//h5[text()='Your most favorite browser']/following::label[text()='Chrome'])[1]")).click();
		
		//UnSelectable
		boolean selected = driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label[text()='Chennai']")).isSelected();
		System.out.println(selected);
		if(selected == false)
		{
			System.out.println("Button is unselected");
		}
		
		//Find Default Select radio button
		String text = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).getText();
		System.out.println("Default select radio button is " + text);
		
		//Select age group (only if not selected)
		boolean selected2 = driver.findElement(By.xpath("(//h5[text()='Select the age group (only if not selected)']/following::span)[3]")).isSelected();
		if (selected2 == false) {
			driver.findElement(By.xpath("(//h5[text()='Select the age group (only if not selected)']/following::span)[3]")).click();
			
		}
		
		}
	
	}


