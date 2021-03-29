package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "/Users/tahakara/LoginSupplyBrain/src/test/Resources/Features" ,
            glue = "/Users/tahakara/LoginSupplyBrain/src/test/java/StepDef" ,
            dryRun = false ,
            tags = "@login"

    )

public class RunCucumberTest {


}

