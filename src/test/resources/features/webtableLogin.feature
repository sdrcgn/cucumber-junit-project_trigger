Feature: Login scenario

  Background:
    Given user is on the homepage


    Scenario: Login scenario with 1 param
      When user enters username "Test"
      And user enters password "Tester"
      And user clicks enter button
      Then user should see url contains orders


      Scenario:  Login scenario with 2 param
        When user enters username "Test" password "Tester" and login
        Then user should see url contains orders



    Scenario: Login scenario with data table
        Given user is on the homepage
        When user enter below credentials
          | username | Test   |
          | password | Tester |
      Then user should see url contains orders