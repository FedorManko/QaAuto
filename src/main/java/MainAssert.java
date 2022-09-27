import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainAssert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://www.onliner.by/");
            Thread.sleep(5000);
            String title = driver.getTitle();
            Assert.assertEquals(title,"Onliner");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}
