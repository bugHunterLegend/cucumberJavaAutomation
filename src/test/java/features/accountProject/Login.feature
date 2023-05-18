#Feature: Application Login
#
#  @RegTest @SmokeTest
#  Scenario: Home page default login
#    Given User is on NetBanking landing page
#    When User login into application with username "lalala" and password "1234"
#    Then Home page is populated
#    And Cards are displayed
#
#  @MobileTest
#  Scenario: Home page default login
#    Given User is on NetBanking landing page
#    When User login into application with username "MobileTest" and password "4321"
#    Then Home page is populated
#    And Cards are displayed
#
#  @WebTest
#  Scenario: Home page default login
#    Given User is on NetBanking landing page
#    When User sign up with following details:
#    | john | 1234 | JohnG@gmail.com | Australia | 456789 |
#    Then Home page is populated
#    And Cards are displayed
#
#  @RegTest
#  Scenario Outline: Home page default login
#    Given User is on NetBanking landing page
#    When User login into application with username "<Username>" and password "<PassWord>"
#    Then Home page is populated
#    And Cards are displayed
#
#    Examples:
#      | Username  | PassWord      |
#      | Username1 | PassWord123   |
#      | Username2 | PassWord123   |
#      | Username3 | PassWord1323  |