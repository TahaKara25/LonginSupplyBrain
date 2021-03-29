package StepDef;


import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

    public class Hook {

        @Before
        public void setup(){
            Driver.get("https://api-demo.supplybrain.io/login").get(ConfigurationReader.getProperty("url"));
            Driver.get("https://api-demo.supplybrain.io/login").manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Driver.get("https://api-demo.supplybrain.io/login").manage().window().maximize();
        }
}
