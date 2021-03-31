# LonginSupplyBrain 
This is POM Framework desing by Singleton patterns desing 
1- I created Feature file with Gherkin Languge 
2- Export/extract the Step Definitions from the console
3- Create a class under step_definitions package, name it like: SupplyBrainSteps , Import Step Definitions in your new class (StepDef Class under stepdef package)
nd deleted the unnecessary parts in the method body. 
4- Then I created a new page class under pages package. Name it Basepage
WebDriver driver;
//constructor
public BasePage(){
//driver=
PageFactory.initElements(Driver.getDriver(), this);
}
// now locators and webelements by using @FindBy annotations
@FindBy(xpath="location")

And create any relevant method.
5- Create a class under Runner package
6- go and change @tag in CukesRunner tags=@Login
 "for update DryRun to True "
 
