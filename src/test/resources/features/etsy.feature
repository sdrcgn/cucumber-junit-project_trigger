Feature: Etsy Title Verification
   User story: As a user see title



  Scenario: Etsy Title Verification
        Given user is on homepage
        Then  user sees title is as expected


  Scenario: Etsy Search Functionality Title Verification
            Given user is on homepage
            And user types Wooden Spoon in the search box
            When user clicks search button
            Then user sees Wooden Spoon is in the title


    Scenario: Etsy Search Functionality Title Verification (with parameterization)
      Given user is on homepage
      And   user types "Wooden Spoon" in the search box
      When  user clicks search button
      Then  user sees "Wooden Spoon" is in the title