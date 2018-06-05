##### DESCRIPTION #####

This set of modules is a JUnit 5.0 based framework for  common/simple Calculator functions testing  using Selenium v. '3.8.1'

##### INSTALLATION #####
(See the full guide of how to Download & Install Selenium WebDriver: https://www.guru99.com/installing-selenium-webdriver.html)

###### To be able to run tests you have to: ######
* install java:
http://www.oracle.com/technetwork/java/javase/downloads/index.html
* install web driver based on your OS:
https://raw.githubusercontent.com/sinshev/base-test/master/jira.utils/chromedriver
* specify path to this driver in the “src/main/resources/config.properties” configuration file
* install ChromeBrowser
https://www.google.com/chrome/
* setUp in build.gradle file of the main root of your project the repository source and dependencies:
https://mvnrepository.com/repos/central

###### repositories ######
{

    mavenCentral()
}
    
###### dependencies ######
{

    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.1.0'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-migrationsupport', version: '5.1.0'

    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.1.0'
    testCompile group: 'org.junit.platform', name: 'junit-platform-gradle-plugin', version: '1.1.0'
    
}

###### _Note: **build.gradle** file(in the main root) - Includes all repository and dependency settings_ ######

##### OVERVIEW #####

######Project structure: ######

├──**src** package

├──├──**main** package

├──├──├──**java** package

├──├──├──├──**onlineCalculator** package

├──├──├──├──├──**elements** package

├──├──├──├──├──├──**OnlineCalculatorWebElementsHelper** class

├──├──├──├──├──**settings** package

├──├──├──├──├──├──**TestInitializer** class

├──├──├──├──├──**test** package

├──├──├──├──├──├──**OnlineCalculatorTest** class


* **onlineCalculator package** within the **main** folder - Includes packages that define test project structure
* **OnlineCalculatorWebElementsHelper class** within the **elements** folder - Describes basic operations to manipulate 
online Calculator elements
* **TestInitializer class** within the **settings** folder - Contains a set of preconditions, postconditions and driver 
configurations that required to run the tests
* **OnlineCalculatorTest package** within the **test** folder - Includes a set of parameterized test methods for testing
 basic calculator functions


