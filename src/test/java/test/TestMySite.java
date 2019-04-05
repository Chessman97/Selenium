package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;


public class TestMySite {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\Documents\\operadriver_win64\\operadriver_win64\\chromedriver.exe");
        options.addArguments("--headless");
        driver = new ChromeDriver();
    }

    @Test
    public void gotoSeleniumWikiPage() {
        driver.get("https://en.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        driver.findElement(By.id("searchButton")).click();
        String header = driver.findElement(By.id("firstHeading")).getText();
        Assert.assertEquals(header, "Selenium");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}




