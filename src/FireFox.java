import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Launch the Url

        driver.get(baseUrl);

        // Maximise Window

        driver.manage().window().maximize();

        // Give Implicit time to driver

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Get title page in console

        String title = driver.getTitle();
        System.out.println(title);

        // Get current Url

        driver.getCurrentUrl();
        System.out.println("Current Url = " +driver.getCurrentUrl());

        // Get current Url login functionality
        String loginUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginUrl);
        System.out.println("Current Url = " + driver.getCurrentUrl());

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("xyz@gmail.com");

        // Sending password to password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));

        //Sending Password to Password field
        passwordField.sendKeys("xyz123456@");
        driver.getPageSource();
        System.out.println("Page Source =" + driver.getPageSource());

        // Close the browser Automatically
        driver.close();



    }
}
