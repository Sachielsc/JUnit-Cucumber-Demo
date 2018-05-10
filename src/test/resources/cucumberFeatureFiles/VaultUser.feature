Feature: Vault User Log in
  Scenario: Log in successful
    Given I navigate to the Vault log in page
    When I type in "plan.6" as my user name
    And I also type in "plan01#" as my password
    Then I should be able to see the Vault homepage