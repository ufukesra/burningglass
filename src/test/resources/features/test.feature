Feature: Events Interview Page

  Scenario: As a candidate I should be able to read burningglass interview process
    Given Navigate to landing page
    When click the events
    And click interviews
    Then get the text of "Interview with Professor Lisa Kahn"
