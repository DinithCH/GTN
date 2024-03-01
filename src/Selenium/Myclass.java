import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GTNLoginTest {
    public static void main(String[] args) {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the URL
        driver.get("https://difc.globaltradingnetwork.com/rubix/login");

        // Set window size
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(1552, 840));

        // Click on the login button
        WebElement loginButton = driver.findElement(By.cssSelector(".btn-primary"));
        loginButton.click();

        // Click on the error message
        WebElement errorMessage = driver.findElement(By.cssSelector(".login_error_msg"));
        errorMessage.click();
        System. out. println("Enter Username & password");

        // Locate and input the username
        WebElement usernameField = driver.findElement(By.id("form-input-live-u"));
        usernameField.sendKeys("test");

        // Locate and input the password
        WebElement passwordField = driver.findElement(By.id("form-input-live-p"));
        passwordField.sendKeys("test");

        // Click on the login button again
        loginButton.click();

        // Click on the error message again
        errorMessage.click();
        System. out. println("Invalid username and password");

        // Close the browser
        driver.quit();
    }
}
