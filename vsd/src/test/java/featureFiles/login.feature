Feature: Bookcart Application tests

  Scenario: 
    Login should be success

    Given User navigate to the Boocart application
    And User clicks on the login button
    And User enter the username as ortoni
    And User enter the password as Pass1234
    When User click on the login button
    Then Login should be success
  
  
  
  
    #Scenario: 
    #Verify the drag and drop
    #When user scroll filter 
    #Then it should filter the amount
