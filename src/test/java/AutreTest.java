import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutreTest {

    WebDriver driver;
    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void TestGoogleSelenium(){

        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("France");
        driver.findElement(By.name("btnK")).click();
    }
    @Test
    public void test3(){
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Venezuela");
        driver.findElement(By.name("btnK")).click();
    }
    @After
    public void after(){
        driver.quit();
    }
}
