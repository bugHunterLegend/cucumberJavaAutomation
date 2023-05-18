Feature: Green Cart

  Scenario: Search Product
    Given User is on GreenCart Landing Page
    When user searched with short name "bbb" and extracted actual name of product
    Then User searched for same shortname in offers page to check if product exist