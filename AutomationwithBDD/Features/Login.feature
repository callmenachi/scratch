Feature: Signin
  Scenario: Successfully Login with Valid Credentials
    Given User Launch the browser 
    When User open the URL "https://collaborationdevi.premierinc.com/"
    And User enter the name as "chope"
    Then User click the Next button
    And User enter the password  as "Premier1"
    Then User click the signin button
    And User close the browser