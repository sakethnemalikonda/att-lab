package week9;
import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week9 {
	public static void main(String[] args) throws InterruptedException,AWTException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("Amazon");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		WebElement amazonLink = driver.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span"));
        amazonLink.click();
        Thread.sleep(5000);
		List<WebElement> m=driver.findElements(By.xpath(""));
		for(int i=0;i<m.size();i++) {
			String s=m.get(i).getText();
			System.out.println("Text is: "+s);
		}
	}
}
