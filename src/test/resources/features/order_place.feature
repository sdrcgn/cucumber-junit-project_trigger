Feature: Order place scenario


  Scenario Outline: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type <productString>
    And user enters quantity <stringQuantity>
    And user enters customer name <stringCustomerName>
    And user enters street <stringStreet>
    And user enters city <stringCity>
    And user enters state <stringState>
    And user enters zipcode <stringZip>
    And user selects credit card type <stringCreditCard>
    And user enters credit card number <stringCardNumber>
    And user enters expiry date <stringExpire>
    And user enters process order button
    Then user should see <string> in first row of the web table
    Examples:
      | productString | stringQuantity | stringCustomerName | stringStreet        | stringCity | stringState | stringZip | stringCreditCard   | stringCardNumber   | stringExpire | string            |
      | "Familybea"   | "2"            | "Sherlock Holmes"  | "221B Baker Street" | "London"   | "England"   | "50505"   | "american express" | "1111222233334444" | "12/23"      | "Sherlock Holmes" |



  Scenario Outline: Order table scenario
    Given user is already logged in and on order page
    When user selects product type "<product>"
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zip>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expireDate>"
    And user enters process order button
    Then user should see "<customer name1>" in first row of the web table

    Examples:
      | product    | quantity | customerName      | street            | city   | state   | zip   | cardType | cardNumber       | expireDate | customer name1    |
      | Familybea  | 2        | Rosalind Franklin | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Rosalind Franklin |
      | MoneyCog   | 4        | Marie Curie       | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Marie Curie       |
      | Screenable | 2        | Rachel Carson     | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Rachel Carson     |
      | MoneyCog   | 3        | Katherina Johnson | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Katherina Johnson |
      | Familybea  | 1        | Marry Anning      | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Marry Anning      |
      | Screenable | 2        | Lise Meitner      | 221B Baker Street | London | England | 50505 | Visa     | 1111222233334444 | 12/23      | Lise Meitner      |