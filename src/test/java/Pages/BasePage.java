package Pages;


import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

    public class BasePage {
        public BasePage() {
            //this method requires to provide webdriver object for @FindBy
            //and page class
            //this means this page class
            PageFactory.initElements(Driver.get(), this);  // findby anotationlar icin pagefactory i kullaniyoruz
        }

    }
