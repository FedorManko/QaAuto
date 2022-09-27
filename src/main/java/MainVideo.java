import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainVideo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.querySelector(#'a').setAttribute('style','capacity:1'");
    }
}
