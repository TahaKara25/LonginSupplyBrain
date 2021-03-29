package Pages;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runners.model.FrameworkField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class SupplyBrainPage extends BasePage {


        @FindBy(id = ("email"))
        public WebElement Email;
        @FindBy(id = ("password"))
        public WebElement Password;

        @FindBy( xpath = ("//button[@class='btn btn-primary']"))
        public WebElement login;

        public void url(){

//            ChromeDriver driver = null;
//            driver.get("https://api-demo.supplybrain.io/login");

        }

        public void enterEmailAdnPassword() {
            Email.sendKeys("njdemo@njtest.com");
            Password.sendKeys("njdemo1234");

        }

        public void login() {
            login.click();
        }


    }

