Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: Docs sections should contain appropriate columns
    Given the user opens Cucumber website
    When the user click on the "Docs" tab
    And the user click on the "Gherkin Syntax" option
    Then page with title "Gherkin Syntax" should be displayed

  @smoke
  Scenario Outline: Docs sections should contain appropriate columns
    Given the user opens Cucumber website
    When the user click on the "Docs" tab
    And the user click on the "<option>" option
    Then page with title "<title>" should be displayed
    Examples:
      | option          | title          |
      | Gherkin Syntax  | Gherkin Syntax |
      | Installation    | Installation   |
      | API Docs        | API Automation |
      | 3rd Party Tools | Related tools  |

