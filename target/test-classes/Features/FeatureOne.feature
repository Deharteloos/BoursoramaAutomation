Feature: Some scenarios
  Scenario: Unavailable page
    Given User on the home page
    When User logged in with "SIDO1" and "Mathematiques29*"
    And User go to page ISR funds
    And User clicks on the link in ISR indices section
    Then The Vigeo requested page should load