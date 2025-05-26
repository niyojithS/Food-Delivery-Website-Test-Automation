
# Theen - Food Delivery Website


## Project Summary:
Designed and implemented an end-to-end automation testing framework for "Theen", a food delivery website, using Selenium WebDriver and TestNG. Integrated Cucumber with Gherkin syntax for BDD, and followed the Page Object Model (POM) to ensure reusability and maintainability. Managed builds with Maven and automated test execution through Jenkins CI/CD pipelines on code commits.
## Technologies Used:
Language: Java

Automation Tools: Selenium WebDriver, TestNG, Cucumber (BDD)

Build & Dependency: Maven

CI/CD: Jenkins

IDE: Eclipse
## Key Features:
Page Object Model (POM) for clear separation of UI and test logic.

BDD with Cucumber & Gherkin for readable, behavior-focused test scenarios.

TestNG for structured test management and grouping.

Maven for dependency and build management.

Jenkins pipeline for continuous integration and automated test runs.

Modular Step Definitions for each feature for easy maintenance and scalability.
## Project Structure
```xml
Theen_Food_DeliveryWebsite/
│
├── src/test/java/
│   ├── Base/                        # WebDriver setup (BaseClass.java)
│   ├── Pages/                       # Page classes using POM
│   │   ├── LoginPage.java
│   │   ├── SignUpPage.java
│   │   ├── MenuPage.java
│   │   ├── CartPayPage.java
│   │   └── SearchSelectProduct.java
│   ├── StepDefinition/             # Step definitions for feature files
│   │   ├── LoginStep.java
│   │   ├── SignupStep.java
│   │   ├── MenuStep.java
│   │   ├── CartPayStep.java
│   │   ├── SearchSelectProductStep.java
│   │   └── Hooks.java
│   ├── Runners/
│   │   └── TestRunner.java         # Runs tests via TestNG+Cucumber
│   └── utils/
│       └── ExtentManager.java      # Extent Reports setup
│
├── src/test/resources/
│   └── Features/                   # Gherkin feature files
│       ├── 2_Login_Page.feature
│       ├── 4_MenuExplore.feature
│       └── 5_Cart&PaymentPage.feature
│
├── pom.xml                         # Maven dependencies & build plugins
├── testng.xml                      # TestNG suite configuration
└── test-output/                    # TestNG output reports

```


## Test Scenarios:
**1. User Sign-Up:**
 • Navigate to Home page and click the SignUp button.
 • Enter name, email, and password.
 • Click Create Account to complete sign-up.

**2. User Login:**
 • Click the Signin button.
 • Enter email and password.
 • Click Login button to access the account.

**3. Search and Add Food to Cart:**
 • Search for a specific food item.
 • Select the desired food from results.
 • Add the item to the cart and verify it appears.

**4. Explore Menu and Select Dishes:**
 • Open the menu to view items.
 • Select a menu category.
 • Choose food items and add them to the cart.

**5. Apply Promo Code and Complete Payment:**
 • Add items to the cart.
 • Apply a promo code.
 • Enter delivery address details.
 • Select payment method and place the order.
 • Verify successful order placement and tracking message.

**6. Order Tracking and History:**
 • View order history.
 • Track current orders status.
## Plugins:
1. **Eclipse Plugin**:
   To run your tests from Eclipse as a TestNG suite, install the **TestNG** plugin via *Eclipse Marketplace* or from the *Available Software Site*.

2. **Maven Dependencies**:

| **Dependency**       | **Version** | **Purpose**                                                                 |
| -------------------- | ----------- | --------------------------------------------------------------------------- |
| **JUnit**            | 4.13.2      | Used by Cucumber for unit testing and integration with test runners.        |
| **Cucumber-Java**    | 7.21.1      | Core library to write BDD step definitions in Java.                         |
| **Cucumber-JUnit**   | 7.21.1      | Integrates Cucumber with JUnit framework for executing feature files.       |
| **Cucumber-TestNG**  | 7.21.1      | Allows integration of Cucumber with TestNG (optional alternative to JUnit). |
| **Selenium-Java**    | 4.28.1      | Browser automation for interacting with web elements.                       |
| **WebDriverManager** | 5.9.3       | Automatically manages browser driver binaries (e.g., ChromeDriver).         |
     

## pom.xml
```xml
  <dependencies>
    <!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.21.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.21.1</version>
    <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>7.21.1</version>
</dependency>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.28.1</version>
</dependency>

<!--
		https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.9.3</version>
		</dependency>
		
<!-- Extent Reports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.0.9</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.11.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>


  </dependencies>
  
  <build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.5.3</version> <!-- Use the latest stable version -->
      <configuration>
        <suiteXmlFiles>
          <suiteXmlFile>testng.xml</suiteXmlFile> <!-- For TestNG -->
        </suiteXmlFiles>
      </configuration>
    </plugin>
  </plugins>
</build>
</project>

```
## Test Execution Summary
Total Tests Executed: 5    
Passed: 5   
Failed: 0    
Skipped/Other: 0

Start Time: May 25, 2025 12:02:45 PM   
End Time: May 25, 2025 12:02:55 PM   
Total Execution Time: 10 seconds  
## List of Scenarios Executed
### Successful User Login
- **Status:** Pass  
- **Duration:** 2.789 seconds    

### User Explores Menu and Selects Favorite Dishes
- Occurred 3 times (test IDs: 2, 3, 4)  
- Each instance passed  
- **Durations:** ~1.5s, 1.08s, 1.06s  

### User Adds Items to Cart
- **Status:** Pass  
- **Duration:** 1.320 seconds (average)

### User Applies Promo Code, Provides Address, and Completes Payment
- **Status:** Pass  
- **Duration:** 1.044 seconds  
 


## Jenkins Report
```xml
Started by user Niyojith
Running as SYSTEM
Building in workspace C:\Tsesting_Selenium\Workspace\Theen_FoodDelivery
Parsing POMs
Established TCP socket on 14749
[Theen_FoodDelivery] $ "C:\Program Files\Java\jdk-17/bin/java" -cp "C:\Users\Niyojith\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-agent-1.14.jar;C:\Program Files\Maven\apache-maven-3.9.9\boot\plexus-classworlds-2.8.0.jar;C:\Program Files\Maven\apache-maven-3.9.9/conf/logging" jenkins.maven3.agent.Maven35Main "C:\Program Files\Maven\apache-maven-3.9.9" C:\Users\Niyojith\.jenkins\war\WEB-INF\lib\remoting-3301.v4363ddcca_4e7.jar C:\Users\Niyojith\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-interceptor-1.14.jar C:\Users\Niyojith\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven3-interceptor-commons-1.14.jar 14749
<===[JENKINS REMOTING CAPACITY]===>channel started
Executing Maven:  -B -f C:\Tsesting_Selenium\Workspace\Theen_FoodDelivery\pom.xml clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< Theen.Orderdemo:Theen_FoodOrder >-------------------
[INFO] Building Theen_FoodOrder 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ Theen_FoodOrder ---
[INFO] Deleting C:\Tsesting_Selenium\Workspace\Theen_FoodDelivery\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ Theen_FoodOrder ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ Theen_FoodOrder ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug target 1.8] to target\classes
[WARNING] bootstrap class path not set in conjunction with -source 8
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ Theen_FoodOrder ---
[INFO] Copying 5 resources from src\test\resources to target\test-classes
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ Theen_FoodOrder ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 14 source files with javac [debug target 1.8] to target\test-classes
[WARNING] bootstrap class path not set in conjunction with -source 8
[INFO] 
[INFO] --- surefire:3.5.3:test (default-test) @ Theen_FoodOrder ---
[INFO] Using auto detected provider org.apache.maven.surefire.testng.TestNGProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.

Scenario Outline: Successful User Login                                     # src/test/resources/Features/2_Login_Page.feature:10
May 25, 2025 11:23:48 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 136, returning the closest version; found: 132; Please update to a Selenium version that supports CDP version 136
  Given user clicks on signin button                                        # StepDefinition.LoginStep.user_clicks_on_signin_button()
  When user enters "niyojithsuresh06@gmail.com", and confirms "NiyoJith@22" # StepDefinition.LoginStep.user_enters_and_confirms(java.lang.String,java.lang.String)
  And user clicks on Login Button                                           # StepDefinition.LoginStep.user_clicks_on_login_button()

Scenario Outline: User explores the menu and selects favorite dishes        # src/test/resources/Features/4_MenuExplore.feature:9
  Given User clicks the menu to view the available items                    # StepDefinition.MenuStep.user_clicks_the_menu_to_view_the_available_items()
  When User selects "Kabab", clicks "Mutton Kabab", and adds it to the cart # StepDefinition.MenuStep.user_selects_and_adds_the_following_food_items_to_the_cart(java.lang.String,java.lang.String)

Scenario Outline: User explores the menu and selects favorite dishes     # src/test/resources/Features/4_MenuExplore.feature:10
  Given User clicks the menu to view the available items                 # StepDefinition.MenuStep.user_clicks_the_menu_to_view_the_available_items()
  When User selects "Rice", clicks "Mandi Rice", and adds it to the cart # StepDefinition.MenuStep.user_selects_and_adds_the_following_food_items_to_the_cart(java.lang.String,java.lang.String)

Scenario Outline: User explores the menu and selects favorite dishes        # src/test/resources/Features/4_MenuExplore.feature:11
  Given User clicks the menu to view the available items                    # StepDefinition.MenuStep.user_clicks_the_menu_to_view_the_available_items()
  When User selects "Rolls", clicks "Chicken Roll", and adds it to the cart # StepDefinition.MenuStep.user_selects_and_adds_the_following_food_items_to_the_cart(java.lang.String,java.lang.String)

Scenario Outline: User applies promo code, provides address, and completes payment                                                                                                  # src/test/resources/Features/5_Cart&PaymentPage.feature:12
  Given the user has added items to the cart                                                                                                                                        # StepDefinition.CartPayStep.the_user_has_added_items_to_the_cart()
  When the user applies promo code "<promo Code>"                                                                                                                                   # StepDefinition.CartPayStep.the_user_applies_promo_code(java.lang.String)
  And the user enters the address with first name "John", last name "Doe", phone "1234567890", street "Main Street", street number "101", building number "12A", city "Springfield" # StepDefinition.CartPayStep.the_user_enters_the_address_with_first_name_last_name_phone_street_street_number_building_number_city(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
  And the user selects the payment method and places the order                                                                                                                      # StepDefinition.CartPayStep.the_user_selects_the_payment_method_and_places_the_order()
  Then the order placed successfully message displayed and Track your order                                                                                                         # StepDefinition.CartPayStep.the_order_placed_successfully_message_displayed_and_Track_your_order()
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.02 s -- in TestSuite
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[JENKINS] Recording test results
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  22.665 s
[INFO] Finished at: 2025-05-25T23:24:00+05:30
[INFO] ------------------------------------------------------------------------
Waiting for Jenkins to finish collecting data
[JENKINS] Archiving C:\Tsesting_Selenium\Workspace\Theen_FoodDelivery\pom.xml to Theen.Orderdemo/Theen_FoodOrder/0.0.1-SNAPSHOT/Theen_FoodOrder-0.0.1-SNAPSHOT.pom
channel stopped
Finished: SUCCESS
```
![Jenkins 1](https://github.com/user-attachments/assets/878a81f0-cc3e-47b1-8518-1b1b0041fc07)

![Jenkins 2](https://github.com/user-attachments/assets/096c744b-aaae-452c-9635-dc0a767d4d21)

![Jenkins 3](https://github.com/user-attachments/assets/3d9a5737-45cc-496a-825e-ee7a3db17c68)

![Jenkins 4](https://github.com/user-attachments/assets/01361346-ad5e-4e95-b5ec-0398eb3e7234)
## Screenshots
![Home Page](https://github.com/user-attachments/assets/2ec8143f-7a41-4c44-bd58-0fc89f4d71e5)

![Feature File in Execution](https://github.com/user-attachments/assets/e27e81cd-59fb-43e2-8679-77955870ae6e)

![Feature File in Execution Output 1](https://github.com/user-attachments/assets/2996d3db-45db-424f-bf3c-8e28ba0b0b5c)

![Feature File in Execution Output 2](https://github.com/user-attachments/assets/2d38d1f0-86bc-4608-9a28-0b05dc79a4a4)

