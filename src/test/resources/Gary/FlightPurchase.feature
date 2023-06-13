Feature: Purchase Flight Ticket Page

  Scenario Outline: Verify User able to purchase flight ticket
    Given User Navigates to Flight Purchase Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<FullName>"
    And User enters Address "<Address>"
    And User enters City "<City>"
    And User enters State "<State>"
    And User enters ZipCode "<ZipCode>"
    And User selects CardType "<CardType>"
    And User enters Card Number "<CardNumber>"
    And User enters Card Exp. Month "<CardExpMonth>"
    And User enters Card Exp. Year "<CardExpYear>"
    And User enters Name on Card "<NameOnCard>"
    And User checks Remember me CheckBox
    And User clicks Purchase Flight button
    Then User Verifies success message "<Message>"

    Examples: 
      | FullName       | Address         | City          | State | ZipCode | CardType         | CardNumber       | CardExpMonth | CardExpYear | NameOnCard     | Message                            |
      | Jhon Cina      | 123 Kevin St    | Dallas        | TX    |  456821 | Visa             | 4444555566667889 |           09 |        2026 | Jhon Cina      | Thank you for your purchase today! |
      | Tom Davis      | 456 Kevin Drive | Seattle       | WA    |   90562 | American Express | 2541365247856589 |           12 |        2030 | Tom Davis      | Thank you for your purchase today! |
      | Fahim Noor     | 789 madina St   | Reston        | VA    |   19245 | Diner's Club     | 4567123456789327 |           11 |        2024 | Fahim Noor     | Thank you for your purchase today! |
      | Michael Stieve | 1525 12th St    | Washington    | DC    |   20900 | Visa             | 3654412357896842 |           12 |        2030 | Michael Stieve | Thank you for your purchase today! |
      | Jhon Thomas    | 839 High St     | San Francisco | CA    |   96075 | American Express | 3216549876554753 |           02 |        2026 | Jhon Thomas    | Thank you for your purchase today! |
