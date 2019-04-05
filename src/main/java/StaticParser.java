import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class StaticParser {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\Documents\\operadriver_win64\\operadriver_win64\\chromedriver.exe");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:8000/");
        System.out.println(driver.toString());
        String save_button = "save_button";
        ((ChromeDriver) driver).findElementById(save_button);
        driver.quit();
    }
}
