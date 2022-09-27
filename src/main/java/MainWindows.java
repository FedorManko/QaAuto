import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class MainWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        try {
            driver.get("https://www.onliner.by/");
            Thread.sleep(5000);
            String window1 = driver.getWindowHandle();
            javascriptExecutor.executeScript("window.open()");
            Set<String> currentWindows = driver.getWindowHandles();
            String window2 = null;
            System.out.println(currentWindows);
            for (String window:currentWindows) {
                if(!window.equals(window1)){
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            driver.get("https://realt.by/");
            driver.close();
            driver.switchTo().window(window1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
