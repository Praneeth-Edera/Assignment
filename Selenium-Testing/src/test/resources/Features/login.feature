@tag
Feature: Title of your feature
  I want to use this template for my feature file

   @tag1
  Scenario: Login with valid credentials
  Given I am on the MyAccount page
  When I fillup <username>
  And I fill <password>
  And I press loginButton
  And click on dashboard
  And click on testcases
  Then click on second testcase
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
