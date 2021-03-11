package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EventsPage;
import utilities.Driver;

public class EventsStepDef {

    EventsPage events = new EventsPage();


    @Given("Navigate to landing page")
    public void navigate_to_landing_page() {
        events.navigateLandingPage();
    }

    @When("click the events")
    public void click_the_events() {

        events.clickEventsTab();
    }

    @When("click interviews")
    public void click_interviews() {

        events.clickInterviews();
    }

    @Then("get the text of {string}")
    public void get_the_text_of(String interviewLisaKhan) {

     events.readLisaKhan(interviewLisaKhan);
    }





}
