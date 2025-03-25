package CMRIT.CMRIT_Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GmailRegister {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Navigate to Gmail sign-up page
        driver.get("http://gmail.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // Click "Create account"
        WebElement createAccount = driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
        createAccount.click();
        Thread.sleep(1000);
        // Select "For myself"
        WebElement mySelf = driver.findElement(By.xpath("(//span[normalize-space()='For myself'])[1]"));
        mySelf.click();
        Thread.sleep(1000);
        // Fill in first and last name
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("abcd");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("efgh");
        // Enter username
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("minnukittusuhas123");
        // Enter password and confirm password
        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("zxcasd@123");
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmPassword.sendKeys("zxcasd@123");
        // Click Next
        WebElement nxtButton = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
        nxtButton.click();
        Thread.sleep(3000);
        // Enter phone number
        WebElement phoneNumber = driver.findElement(By.xpath("(//input[@id='phoneNumberId'])[1]"));
        phoneNumber.sendKeys("9876534538");
        // Select Date of Birth and Gender
        Thread.sleep(2000);
        Select month = new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
        month.selectByValue("8"); // August
        WebElement day = driver.findElement(By.xpath("(//input[@id='day'])[1]"));
        day.sendKeys("24");
        WebElement year = driver.findElement(By.xpath("(//input[@id='year'])[1]"));
        year.sendKeys("1996");
        Select gender = new Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
        gender.selectByValue("1"); // Assuming 1 represents Male
        // Click Next
        WebElement nxtButton2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
        nxtButton2.click();
        // Close the browser after execution (Optional)
        Thread.sleep(5000);
        driver.quit();
    }
}
