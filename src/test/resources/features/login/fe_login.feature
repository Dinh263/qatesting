Feature: Login - FE

  @login
  Scenario: As an user I want to login the application successfully
    Given that the user is on index page
    When the user logins with correct credential
    Then the user can log in to application successfully

