package selenium.week2.day2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundsButtons {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//span[text() ='Click']")).click();
		String title = driver.getTitle();
		String title1 = "Dashboard";
		if (title.equals(title1)) {
			System.out.println("Title printed");
		}
		driver.navigate().back();
		boolean enabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if (enabled == false) {
			System.out.println("Button is disabled");
		}

		// To Find Location of a Web Element
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']/span[text()='Submit']"));

		org.openqa.selenium.Point location = submitButton.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);

		// To Find the color of a Web Element
		String cssValue = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']/span[text()='Save']"))
				.getCssValue("color");
		System.out.println(cssValue);
		String color = Color.fromString(cssValue).asHex();
		System.out.println(color);

		// To Find Height and Width of a button or Web Element

		Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']/span[text()='Submit']"))
				.getSize();

		System.out.println(size.width);
		System.out.println(size.height);

		// MouseOver Submit Button Web Element
//		String colorBefore = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span")).getCssValue("background-color");
		String colorBefore = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"))
				.getAttribute("style");

		WebElement submit = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"));
		Actions action = new Actions(driver);

		action.moveToElement(submit).perform();
		// String mouseOverColor =
		// driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span")).getCssValue("background-color");
		String mouseOverColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"))
				.getAttribute("style");
		if (colorBefore.equals(mouseOverColor)) {
			System.out.println("Color not Changed");
		} else {
			System.out.println("Color Changed");
		}
		
		
	}

}
