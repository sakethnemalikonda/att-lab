package saketh;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week5 {
	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","F:\\Lab\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cmritautonomous.org/BeesERP/Login.aspx");
		WebElement userName=driver.findElement(By.name("txtUserName"));
		userName.sendKeys("20R01A05K6P");
		Thread.sleep(2000);
		WebElement nxtBtn=driver.findElement(By.name("btnNext"));
		nxtBtn.click();
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("20R01A05K6P");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.name("btnSubmit"));
		submit.click();
	}
}

Another similar program:-

package cseb5x0;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week5 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://results.cmrithyderabad.edu.in/");
		driver.get("https://results.cmrithyderabad.edu.in/result/9c567e59f3e34f3e8ea751cc84e22cca");
		WebElement searchBar=driver.findElement(By.className("hallticket"));
		searchBar.sendKeys("23R01A05V5");
		Thread.sleep(2000);
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
}
