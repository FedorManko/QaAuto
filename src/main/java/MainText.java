import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.avito.ru/rossiya/avtomobili");
        WebElement element2 = driver1.findElement(By.cssSelector(".popular-rubricator-count-CX8Mx"));
        System.out.println(element2.getText());
    }
}
