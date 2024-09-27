Feature: Login Functionality

  Background:
    Given the user navigates to the login page
    And the login page is displayed displayed properly

  Scenario Outline: Valid username and password
    When the user logs in with username "<username>" and password "secret_sauce"
    Then the user should be redirected to the homepage

    Examples:
      | username                |
      | standard_user           |
      | locked_out_user         |
      | problem_user            |
      | performance_glitch_user |

  Scenario Outline: Invalid username and password
    When the user attempts to log in with invalid username "<username>" and password "<password>"
    Then an error message should be displayed

    Examples:
      | username | password |
      | invalid1 | invalid1 |
      | invalid2 | invalid2 |