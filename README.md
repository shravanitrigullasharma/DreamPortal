Dream Portal – QA Automation

Project Overview

This project automates functional testing of the Dream Portal website using Selenium WebDriver with Java, Maven, and TestNG.

Website: https://arjitnigam.github.io/myDreams/

Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Chrome WebDriver
* Maven Surefire Reports

Project Structure

DreamPortal
├── src
│   ├── main
│   │   └── java
│   │       ├── pages
│   │       │   ├── HomePage.java
│   │       │   ├── DreamDiaryPage.java
│   │       │   └── DreamTotalPage.java
│   │       └── utils
│   │           └── DriverFactory.java
│   │
│   └── test
│       └── java
│           └── com.dreamportal.tests
│               ├── HomePageTest.java
│               ├── DreamDiaryTest.java
│               └── DreamTotalTest.java
│
├── pom.xml
└── README.md

Automated Test Scenarios

Home Page

* Verify loading animation is displayed.
* Verify loading animation disappears after page loading.
* Verify the “My Dreams” button is displayed.
* Verify clicking “My Dreams” opens the Dream Diary and Dream Total pages in new tabs/windows.

Dream Diary

* Verify exactly 10 dream entries are available.
* Verify all Dream Type values are either Good or Bad.
* Verify all Dream Type cells are populated.
* Verify all Days Ago values are populated.
* Verify “Flying over mountains” is a recurring dream.
* Verify “Lost in maze” is a recurring dream.

Dream Total

* Verify Good Dreams count is 6.
* Verify Bad Dreams count is 4.
* Verify Total Dreams count is 10.
* Verify Recurring Dreams count is 2.

Test Execution

To execute the tests using Maven:

mvn test

Test Results

Latest execution:

* Total Tests: 13
* Passed: 13
* Failed: 0
* Errors: 0
* Skipped: 0

Reporting

Maven Surefire/TestNG HTML reports are generated under:

target/surefire-reports

The generated report can be opened using the index/index.html report file.

Framework Design

The framework follows the Page Object Model (POM) design pattern.

* Page classes contain locators and page-specific actions.
* Test classes contain test cases and assertions.
* DriverFactory manages WebDriver creation and cleanup.
* TestNG is used for test execution and assertions.
* Maven is used for dependency management and test execution.