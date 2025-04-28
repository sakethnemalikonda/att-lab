package cseb5x0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Week2 {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize browser window
        driver.get("https://www.mercurytravels.co.in/");
        Thread.sleep(2000);
        // Initialize Actions class
        Actions actions = new Actions(driver);
        // Hover over "Customer Login"
        WebElement CustomerLogin = driver.findElement(By.xpath("//a[contains(text(),'Customer Login')]"));
        actions.moveToElement(CustomerLogin).build().perform();
        Thread.sleep(1000);
        // Click on "Register"
        WebElement Register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        Register.click();
        Thread.sleep(2000);
        // Fill registration form
        driver.findElement(By.name("first_name")).sendKeys("Saketh");
        Thread.sleep(1000);
        driver.findElement(By.name("last_name")).sendKeys("Nemalikonda");
        Thread.sleep(1000);
        driver.findElement(By.id("acc_user_email")).sendKeys("sakethnemalikonda@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("acc_user_password")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.id("acc_user_passconf")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.id("acc_mobile_no")).sendKeys("8121058116");
        Thread.sleep(1000);
        // Click Register Button
        WebElement Reg_Button = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        Reg_Button.click();
        Thread.sleep(3000); // Allow time to process registration
        System.out.println("Registration form submitted successfully!");
        driver.close(); // Close browser
    }
}
