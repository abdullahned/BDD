Feature: Login Application feature

Scenario: User login scenario

Given user is already on Login Page
When title of login page is Selfie Styler
Then user enters username and password
Then user clicks on login button
Then user is on home page
Then close the browser
