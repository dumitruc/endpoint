@api
Feature: Check the api component
  As a test analyst
  I want to test that the api talks correctly to the backend systems
  So that the it is ready for the integration

Scenario: Send basic request
  Given I have generated the most basic request
  When I forward the request to my api component
  Then it will forward a request to backend component
  And respond back successfully