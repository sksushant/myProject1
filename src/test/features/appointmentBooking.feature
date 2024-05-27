Feature: As a test user
  I should be able to Log in to Cura Health Services and book an appointment

  @BookAppointmentInCura
  Scenario: Appointment Booking Validation
    Given I should open url
    When I click on Appointment page
    Then I should enter to Login Page
    When I enter a valid username
    And I enter a valid password
    And I click on login button
    Then I should log in successfully to homepage
    When I enter Appointment Details
    Then I should be able to book Appointment successfully
    Then I should Log out