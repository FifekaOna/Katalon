#Author: Fifeka Onanda Wahid

@tag
Feature: Login 

  @tag1
  Scenario Outline: User succesfully login to their account
  
    Given I go to Fabelio homepage
    When I click  login icon
    Then I verify login pop-up appears
    When I input <email> in email field in login pop-up
    And I input <password> in password field in login pop-up
    And I click masuk button in login pop-up
    Then I verify i have been logged in
    
    Examples:
    |email                 |password|
    |fifekawahid@gmail.com |12345678|

