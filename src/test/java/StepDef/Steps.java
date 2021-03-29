package StepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tahakara/Desktop/Selenium/Chrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        driver.get("https://api-demo.supplybrain.io/login");


        driver.findElement(By.id("email")).sendKeys("njdemo@njtest.com");
        driver.findElement(By.id("password")).sendKeys("njdemo1234");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();



    }
}


