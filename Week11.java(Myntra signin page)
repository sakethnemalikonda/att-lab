package CMRIT.CMRIT_Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra_SignIn {
    public static void main(String[] args) throws InterruptedException {
        // System property for chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe"); 
        // Creating WebDriver object
        WebDriver driver = new ChromeDriver();
        // Maximizing the browser
        driver.manage().window().maximize();
        // Launch Google website
        driver.get("https://www.google.co.in/");
        // Fetching the Google search bar
        WebElement searchBar = driver.findElement(By.name("q"));
        // Sending "Myntra" in search bar
        searchBar.sendKeys("Myntra");
        Thread.sleep(1000);
        // Submitting the search
        searchBar.submit();
        // Fetching Myntra link from Google search
        WebElement myntraLink = driver.findElement(By.xpath("(//h3[contains(text(),'Myntra: Online Shopping for Women, Men, Kids Fashi')])[1]"));
        myntraLink.click();
        // Clicking on Profile
        WebElement profileHyperLink = driver.findElement(By.xpath("(//span[normalize-space()='Profile'])[1]"));
        profileHyperLink.click();
        // Clicking on login/signup
        WebElement loginBtn = driver.findElement(By.xpath("(//a[normalize-space()='login / Signup'])[1]"));
        loginBtn.click();
        // Entering mobile number
        WebElement mobileNo = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
        mobileNo.sendKeys("9948621019");
        // Clicking on Continue button
        WebElement continueBtn = driver.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
        continueBtn.click();
        Thread.sleep(1000);
        // Entering OTP (assuming it's a test OTP)
        WebElement otp01 = driver.findElement(By.xpath("(//input[@name='otp0'])[1]"));
        otp01.sendKeys("1");
        WebElement otp02 = driver.findElement(By.xpath("(//input[@name='otp1'])[1]"));
        otp02.sendKeys("2");
        WebElement otp03 = driver.findElement(By.xpath("(//input[@name='otp2'])[1]"));
        otp03.sendKeys("3");
        WebElement otp04 = driver.findElement(By.xpath("(//input[@name='otp3'])[1]"));
        otp04.sendKeys("4");
        // Closing the browser
        driver.close();
    }
}
