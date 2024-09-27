# SwagLabs Technical Test
 Swag Labs automation for project to solve technical test.

## Description
This project uses Java, Selenium, Cucumber and Gherkin. We use POM (Page Object Model) to create a more maintainable and scalable automation framework.

## Test Cases
We will cover with automation scripts the login functionality of the Swag Labs application.

1. Valid usernames and passwords for each user proportioned by the application.
2. Invalid usernames and/or passwords.

## Project Structure
- The project is structured as follows:
   - `src/test/java/features/`: Contains Gherkin features.
   - `src/test/java/pom/`: Page Object Model classes.
   - `src/test/java/runner/`: Contains test runner and driver manager classes.
   - `src/test/java/runner/driverManager/`: Contains the driver management
   - `src/test/java/seleniumgluecode/`: Contains steps definitions (glue code) and hooks.

- Some of the key classes are:
   - `TestRunner.java`: Orchestrates the execution of Cucumber scenarios, allowing to define which feature files to run and configure test suite options.
   - `Background.java`: Contains shared step definitions and setup code that are common to multiple Cucumber scenarios.
   - `Hooks.java`: Contains setup and teardown code (e.g., Before and After hooks).
   - `TestBase.java`: Provides a base class for Page Factory init.


## Running the tests

Follow these steps to run the automated tests:

1. Prerequisites:
   - Ensure you have the necessary prerequisites installed, including Java and Maven.
   - Make sure you have the WebDriver for your preferred browser (e.g., Chrome, Firefox) installed and configured.

2. Clone the Repository: 
```
git clone https://github.com/kpacheco1210/SwagLabs.git
cd SwagLabs
```

3. Run Tests:
    - Make sure you are place in the root directory of the project.
    - To run all tests, use the following command:

```
mvn test
```

## Example of cucumber report
|<img width="800" alt="image" src="https://github.com/user-attachments/assets/21aafc3f-14a0-42d6-9ff3-70a685ea1e19">|
| - |

