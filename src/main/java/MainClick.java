import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.dev.by/");
        WebElement element = driver1.findElement(By.xpath("//a[text()='Вход']"));
        element.click();
    }
}
