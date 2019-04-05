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

    //Добавим WebDriver
    private static WebDriver driver;
    //Добавим url
    private static String URL = "http://127.0.0.1:8000/";

    @BeforeClass
    public static void setUp() {
        //Подключение WebDriver
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\Documents\\operadriver_win64\\operadriver_win64\\chromedriver.exe");
        options.addArguments("--headless");
        //Создание Chrome WebDriver
        driver = new ChromeDriver();
    }

    //Тестируем википедию
    @Test
    public void gotoSeleniumWikiPage() {
        driver.get("https://en.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        driver.findElement(By.id("searchButton")).click();
        String header = driver.findElement(By.id("firstHeading")).getText();
        Assert.assertEquals(header, "Selenium");
    }

    //Тестируем наш сайт
    @Test
    public void initSeleniumLocalPage() {
        driver.get(URL);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}




