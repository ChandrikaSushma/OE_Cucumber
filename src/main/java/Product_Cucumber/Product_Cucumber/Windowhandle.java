package Product_Cucumber.Product_Cucumber;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\2021Practice\\2021Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://product.stage.onlineeventapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Cookie Policy']")).click();
		driver.findElement(By.xpath("//span[text()='Terms of Use']")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Object[] win = windows.toArray();
		String win1 = win[0].toString();
		String win2 = win[1].toString();
		String win3 = win[2].toString();
		Thread.sleep(2000);
		driver.switchTo().window(win3);
		String s1 = driver.getTitle();
		System.out.println(s1);
		driver.switchTo().window(win2);
		String s2 = driver.getTitle();
		System.out.println(s2);
		driver.switchTo().window(win1);
		driver.findElement(By.xpath("//div[text()='Case Study']")).click();

	}

}
