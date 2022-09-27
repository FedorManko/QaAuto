import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.avito.ru/rossiya/avtomobili");
        WebElement element1 = driver1.findElement(By.xpath("//option[@data-marker='option(9)']"));
        String par = element1.getAttribute("selected");
        System.out.println(par);
    }
}
