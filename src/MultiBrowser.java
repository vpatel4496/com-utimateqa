import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser not Found");
        }

        // Maximise Window

        driver.manage().window().maximize();

        // Give implicit time to driver

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page in console

        String title = driver.getTitle();
        System.out.println(title);

        // Get current Url

        driver.getCurrentUrl();
        System.out.println("Current Url = " + driver.getCurrentUrl());

        // Get current Url (Login Functionality)

        String loginUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginUrl);
        System.out.println("Current Url = " + driver.getCurrentUrl());

        // Fiend the email field elements

        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("xyz@gmail.com");

        // Find password field element

        WebElement passwordfield = driver.findElement(By.name("user[password]"));

        // Sending password in password field element

        passwordfield.sendKeys ("Xyz123456");

        // Getting Page source

        driver.getPageSource();
        System.out.println("Page Source" + driver.getPageSource());

        // Close the browser automatically

          driver.close();


    }
}
