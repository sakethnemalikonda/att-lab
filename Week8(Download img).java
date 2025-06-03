package CMRIT.CMRIT_Assignment;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class GoogleImageDownload {
    public static void main(String[] args) throws Exception {
        // Corrected ChromeDriver path spacing issue
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open Google
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        // Search for "CMRIT"
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("CMRIT");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        // Click on "Images"
        driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
        // Find the image and right-click on it
        WebElement Image = driver.findElement(By.xpath("//img[@alt='The CMRIT Campus - CMR IT']"));
        Actions action = new Actions(driver);
        action.contextClick(Image).build().perform();
        // Simulate "Save Image As" option using Robot class
        Robot robot = new Robot();
        for (int i = 0; i < 8; i++) { // Move down 8 times to reach "Save Image As" option
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(500);
        }
        robot.keyPress(KeyEvent.VK_ENTER); // Press Enter to open save dialog
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER); // Confirm save
        System.out.println("Image downloaded successfully.");
        driver.close();
    }
}
