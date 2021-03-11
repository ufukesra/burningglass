package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EventsPage  {

    WebDriver driver= Driver.get();

    public EventsPage(){
        PageFactory.initElements(driver,this);
    }

    public WebElement waitforVisibility(WebElement element,int seconds){

        WebDriverWait wait=  new WebDriverWait(driver,seconds);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitFor(int seconds){
        try {
            Thread.sleep(seconds);//We can habndle thread sleep in 2 ways
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //1 is try catch block
        // 2 is throws Interrrupted exceptions


    }

    @FindBy(xpath = "//span[text()=\"Events\"]")
    public WebElement evetsTab;

    @FindBy(xpath = "//span[text()=\"Interviews\"]")
    public WebElement interviewTab;

    @FindBy(xpath = "//article[@id=\"post-14708\"]/h2/a")
    public WebElement lisaKhan;

    @FindBy(className = "post-content")
    public WebElement interviewText;



    public void navigateLandingPage()  {
        String url = ConfigurationReader.get("url");
        driver.get(url);

        waitFor(2);


    }

    public void clickEventsTab(){
       waitforVisibility(evetsTab,5);
        Actions action = new Actions(driver);
        action.moveToElement(evetsTab).build().perform();
       waitFor(2);

    }


    public void clickInterviews(){
        waitforVisibility(interviewTab,5);
        interviewTab.click();

        waitFor(2);

    }

    public void readLisaKhan(String interviewerName){

        waitforVisibility(lisaKhan,5);

        Assert.assertEquals(interviewerName,lisaKhan.getText());
        String interviewT=interviewText.getText();
        System.out.println("INTERVIEW TEXT WITH LISA KHAN\n"+interviewT);



    }
}
