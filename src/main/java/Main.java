import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
        WebElement input1 = driver.findElement(By.className("gNO89b"));
        input1.click();
        List<WebElement> inputs = driver.findElements(By.xpath("//input[@aria-label='Найти']"));
        input.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//явные
        WebElement element = (new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));//неявные
    }
}
