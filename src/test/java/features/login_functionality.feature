Feature: Login Functionality

  Background:
    Given the user navigates to the login page
    And the login page is displayed displayed properly

  Scenario Outline: Valid username and password
    When the user logs in with username "<username>" and password "secret_sauce"
    Then the user should be redirected to the homepage
    And the homepage should be displayed properly

    Examples:
      | username                |
      | standard_user           |
      | problem_user            |
      | performance_glitch_user |

  Scenario Outline: Locked out user
    When the user logs in with username "<username>" and password "secret_sauce"
    Then a locked user error message should be displayed

    Examples:
      | username      |
      | locked_out_user |

  Scenario Outline: Invalid username or password
    When the user logs in with username "<username>" and password "<password>"
    Then an error message should be displayed

    Examples:
      | username | password |
      | invalid1 | secret_sauce |
      | standard_user | invalid1 |
      | standard_user | Secret_sauce |