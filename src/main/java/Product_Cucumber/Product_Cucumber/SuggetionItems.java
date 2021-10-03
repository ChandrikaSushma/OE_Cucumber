package Product_Cucumber.Product_Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggetionItems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\2021Practice\\2021Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		WebElement items = driver.findElement(By.xpath("//ul[@class='G43f7e']"));
		Thread.sleep(5000);
		List<WebElement> l1 = items.findElements(By.tagName("li"));
		System.out.println(l1.size());
		for (int i = 0; i <= l1.size(); i++) {
			String s = l1.get(i).getText();
			System.out.println(s);
			if (s.equalsIgnoreCase("selenium testing")) {
				l1.get(i).click();
				break;
			}
		}
		driver.close();

	}

}
