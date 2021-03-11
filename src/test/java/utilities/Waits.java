package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    public static void waitFor(int seconds){
        try{
            Thread.sleep(seconds);
        }catch(InterruptedException e){
            e.printStackTrace();

        }
    }

    public static WebElement waitForVisibility(WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(Driver.get(),seconds);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
