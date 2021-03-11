Full Name : Ufuk Sahinduran

Project Title : Betbull QA Engineer-Mobile/Web/API Tasks

Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. Here is the guide for maven installation just in link : https://maven.apache.org/install.html Project get all dependencies from maven repository. So no additional installation needed.

Below are the dependencies are being used for this project : Selenium, Cucumber, Junit, RestAssured, Github Bonigarcia(WebDriverManager)


Web Testing:
Comfiguration.properties: This is the file that we can store and manage our data.

Configuration Reader class: this class is read data from Config file.

recources: this directory for storing fature files which contain our scenario

Scenarios: created based on BDD by Gherkin syntax

Driver class: it contains selenium webdriver which I initialised for chrome and firefox driver.

Hook class: this class is for running before and after each and every scenarios. I have added scenario name, before and 
after also implicity wait for UI test and maximize screen.

Cukes Runner class: This class for running our test by cucumber options which contains feature file andstap definitions pathway.

Step Definitions: EventsStepdef class: This class for running our scenario and steps from eature file. I also
created an Events class object to be able to call methods from class.

EventsPage class: I have created my methods such as Thread sleep ar explicit wait and scenario step in this class.


I can also create Thread sleep and Explicit wait class and make these methods public static keyword then I can use these methods any 
of the project by calling class name.

After I push this framework in the github repository then I can run it with Jenkins by using AWS EC2 instance or Azure cloud function.


