package week9;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week9 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement qsearchBar=driver.findElement(By.id("APjFqb"));
		qsearchBar.sendKeys("amazon in");
		qsearchBar.sendKeys(Keys.ENTER);
		Thread.sleep(10000); 
		WebElement amazonLink=driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]"));
		amazonLink.click();
		Thread.sleep(1000);
		WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Watches");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> m=driver.findElements(By.xpath("//div[@class=\"a-row a-size-base a-color-secondary\"]"));
		for(int i=0;i<m.size();i++) {
			String s=m.get(i).getText();
			System.out.println("Text is:"+s);
			Thread.sleep(500);
		}
	} 
}
