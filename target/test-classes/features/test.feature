Feature: Test Google landing page

  Scenario: As a candidta I shold be able to read burningglass interview process
    Given Navigate to landing page
    When click the events
    And click interviews
    Then get the text of "Interview with Professor Lisa Kahn"
