#Author: Fifeka Onanda Wahid
@tag
Feature: Register

  @tag1
  Scenario Outline: User succesfully register new account
    Given I go to Fabelio homepage
    When I click  login icon
    Then I verify login pop-up appears
    When I click buat akun sekarang link
    Then I verify register page appears
    When I input <nama_depan> in nama depan field in register page
    And I input <nama_belakang> in nama belakang field in register page
    And I input unique email in email field in register page
    And I input <password> in password field in register page
    And I input <confirm_password> in confirm password field in register page
    And I click term and condition in register page
    And I click register button in register page
    Then I verify I already registered

    Examples: 
      | nama_depan | nama_belakang | password|confirm_password|
      | Fifeka     | Wahid         | 12345678|12345678        |
