Feature: Validate The search

Scenario Outline: As a user I would like to use search box and be able to see results of: "<search phrase>"
    Given You are on the HomePage "http://automationpractice.com/index.php"
    When I search for phrase "<search phrase>"
    And I click on search icon
    Then I can see numbers of results equals to "<expected results>"
    And I can see that every results which have been found contains phrase "<search phrase>"

    Examples: SCENARIO OUTLINE DATA
      | search phrase | expected results |
      | T-shirts      | 1                |
      | Blouse        | 1                |
      | Printed Dress | 5                |
      |  chiffon      | 2                |