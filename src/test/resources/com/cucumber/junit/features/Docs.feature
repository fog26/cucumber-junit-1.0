Feature: As a user I want to get ability to use menu sections


  @smoke
  Scenario: Docs sections should contain appropriate columns
    Given the user opens Cucumber website
    When the user click on the "Docs" tab
    And the user click on the "Installation" option
    Then there is 11 items in the let-side menu
    And left-side menu contain the following links
      | Installation                 |
      | Guides                       |
      | Professional Services        |
      | Cucumber                     |
      | Gherkin Syntax               |
      | Behaviour-Driven Development |
      | Community                    |
      | Sponsors                     |
      | Tools                        |
      | Terminology                  |