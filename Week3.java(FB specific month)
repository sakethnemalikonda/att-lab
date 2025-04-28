import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookReg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Lab\\Updated\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize window
        driver.get("https://www.facebook.com/");
        Thread.sleep(500); 
        // Click "Create new account"
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
        // Fill in registration details
        driver.findElement(By.name("firstname")).sendKeys("ashu");
        Thread.sleep(500);
        WebElement surName = driver.findElement(By.name("lastname"));
        surName.sendKeys("kamatam");
        Thread.sleep(500);
        WebElement mobileNoOrEmailId = driver.findElement(By.name("reg_email__"));
        mobileNoOrEmailId.sendKeys("1234567890");
        Thread.sleep(500);
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123ashu");
        Thread.sleep(500);
        // Select Date of Birth
        Select dateDropdown = new Select(driver.findElement(By.name("birthday_day")));
        dateDropdown.selectByValue("24");
        Thread.sleep(500);
        Select monthDropdown = new Select(driver.findElement(By.name("birthday_month")));
        monthDropdown.selectByValue("12");
        Thread.sleep(500);
        Select yearDropdown = new Select(driver.findElement(By.name("birthday_year")));
        yearDropdown.selectByValue("1996");
        Thread.sleep(500);
        // Select Gender
        WebElement femaleRadioBtn = driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
        femaleRadioBtn.click();
        Thread.sleep(500);
        // Click Sign Up button
        WebElement signUpBtn = driver.findElement(By.name("websubmit"));
        signUpBtn.click();
        System.out.println("Facebook account registration initiated successfully.");
        // Close driver after a few seconds
        Thread.sleep(5000);
        driver.quit();
    }
}
