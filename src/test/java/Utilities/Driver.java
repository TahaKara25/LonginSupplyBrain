package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
        private static RemoteWebDriver driver;

        public Driver(){

        }
        public static WebDriver get(){

            if(driver == null){
                String browser = Utilities.ConfigurationReader.getProperty("browser");
                switch (browser){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                }
            }
            return driver;
        }
    }

