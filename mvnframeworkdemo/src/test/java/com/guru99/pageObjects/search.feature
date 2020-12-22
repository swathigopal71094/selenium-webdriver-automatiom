Feature: Amazon search feature test

  Scenario: Amazon search feature validation
    Given the user is already on searchbox at home page
    When user enters product "watches" and press enter
    Then watches should be displayed
