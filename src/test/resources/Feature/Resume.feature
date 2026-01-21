Feature: Update Resume

  Scenario: Open Naukri and Update Resume
    Given Hit the Browser Open the URL
    Then  Enter the Username and Password
    And Click Login 
    When Home page visible Click View Profile
    Then Upload Resume
