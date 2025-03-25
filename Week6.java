package CMRIT.CMRIT_Assignment; 
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Ajio {
  public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.ajio.com/"); 
    driver.manage().window().maximize(); 
    Thread.sleep(2000);
    WebElement ajioLink = driver.findElement(By.xpath("//span[normalize-space()='Sign In / Join AJIO']"));
    ajioLink.click(); 
    Thread.sleep(2000);
    WebElement facebookBtn = driver.findElement(By.xpath("//span[normalize-space()='Facebook']"));
    facebookBtn.click(); 
    Thread.sleep(2000);
    Set<String> parentWindow = driver.getWindowHandles(); 
    Iterator<String> iterator = parentWindow.iterator(); 
    while(iterator.hasNext()) {
      String childWindow = iterator.next();
      if(!parentWindow.equals(childWindow)) {
        driver.switchTo().window(childWindow);
      }
    }
    WebElement emailOrMobileNo = driver.findElement(By.xpath("//input[@id='email']"));
    emailOrMobileNo.sendKeys("martin@gmail.com");
    WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']")); 
    pwd.sendKeys("Martin@123");
    WebElement loginBtn = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > form:nth-child(1) > div:nth-child(4) > div:nth-child(16) > label:nth-child(2) > input:nth-child(1)"));
    loginBtn.click();
  }
}
