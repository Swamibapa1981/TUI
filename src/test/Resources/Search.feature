@SmokeTestCases
Feature: Search on TUI Group website
  As a User
  I want to see the TUI Group website
  So that User can see the respective result
  Background:
    Given  User is on TUI Group website and Validate User is on Right webpage.
    When   User click on cookies and accept it.
@Smoke1
  Scenario: User visiting TUI Group website and looking "About TUI Group" in About Us Header.
    And   User click on About Us link on TUI Group webpage and Select "About TUI Group".
    And   User is now on About TUI Group webpage and then click on "Management".
    And   User Print Executive Board Member name "Friedrich Joussen" and Validate his Position in TUI Group.
    And   User print How many Executive Board Members are on TUI Group Website.
    Then  User can see the respective result.
@Smoke2
  Scenario: User visiting TUI Group website and looking for "Reporting & Downloads" in Responsibility Header.
    And   User click on Responsibility link on TUI Group webpage and select "Reporting & Downloads"
    And   User click on 2019 box.
    Then  User can see the respective result.

