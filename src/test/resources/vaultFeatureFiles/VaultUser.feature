Feature: Vault User Log in
  Users need to login

  @LoginSuccess
  Scenario: Log in successful
    Given I navigate to the Vault log in page
    When I type in "plan.6" as my user name
    And I also type in "plan01#" as my password
    And I click the Login Button
    Then I should be able to see the Vault homepage