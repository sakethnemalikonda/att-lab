package week12;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week12 {
	public static void main(String[] args)throws InterruptedException,AWTException{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("convert word to pdf online for free");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		WebElement pdfFromWordHyperLink = driver.findElement(By.xpath("(//h3[normalize-space()='Convert Word to PDF. Documents DOC to PDF'])"));
		pdfFromWordHyperLink.click();
		Thread.sleep(2000);
		WebElement chooseFileBtn = driver.findElement(By.xpath("(//span[normalize-space()='Select WORD files'])"));
		chooseFileBtn.click();
		Thread.sleep(500);	
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection("\"C:\\Users\\student\\Downloads\\file-sample_100kB.docx\"");
		clipboard.setContents(str,null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement convertToWordBtn=driver.findElement(By.id("processTask"));
		convertToWordBtn.click();
		WebElement download = driver.findElement(By.xpath("(//span[normalize-space()='Download'])"));
		download.click();	
	}
}
