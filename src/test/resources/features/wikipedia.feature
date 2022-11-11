Feature: Wikipedia Search Functionality Title Verification


Background:
  Given user is on Wikipedia home page

@smoke
  Scenario: Wikipedia Search Functionality Title
       #Given user is on Wikipedia home page
       Then  user types Steve Jobs in the wiki search box
       Then user clicks wiki search button
       Then user sees Steve Jobs is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
       #Given user is on Wikipedia home page
       Then user types "Steve Jobs" in the wiki search box
        And user clicks wiki search button
        When user sees "Steve Jobs" is in the main header


    Scenario Outline:  Wikipedia Search Functionality Header Verification
       #Given user is on Wikipedia home page
      Then user types "<searchValue>" in the wiki search box
      And user clicks wiki search button
      When user sees "<expectedTitle>" is in the main header

      Examples:
        | searchValue | expectedTitle |
        | Steve Jobs  | Steve Jobs    |
        | Bill Gates  | Bill Gates    |
        | Elon Musk   | Elon Musk     |