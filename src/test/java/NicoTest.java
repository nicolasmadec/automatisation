import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NicoTest {
    private String recherche;
    WebDriver driver;
    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testRechercheGoogle(){
        recherche = System.getProperty("recherche");
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(recherche);
        driver.findElement(By.name("btnK")).click();
    }

    @After
    public void after(){
        driver.quit();
    }

}
