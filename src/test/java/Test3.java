import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test3 {
    private WebDriver driver;

    @Test
    public void test() {
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Venezuela");
        driver.findElement(By.name("btnK")).click();
    }
}
