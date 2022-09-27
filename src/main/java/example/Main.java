package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Фёдор\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.id("user-name"));
        login.click();
        login.sendKeys("standard_user");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

    }
}
