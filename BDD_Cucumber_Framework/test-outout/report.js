$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Application feature",
  "description": "",
  "id": "login-application-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User login scenario",
  "description": "",
  "id": "login-application-feature;user-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Selfie Styler",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_application_home_page()"
});
formatter.result({
  "duration": 8553133620,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.title_of_login_page()"
});
formatter.result({
  "duration": 10615143,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 12853698095,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 13069130863,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 320078950,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "duration": 649984541,
  "status": "passed"
});
});