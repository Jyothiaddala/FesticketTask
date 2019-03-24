$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Jyothiaddala/Documents/JavaTraining/Festicket/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Festicket Login Scenario",
  "description": "",
  "id": "login-feature;festicket-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of page is Festival Tickets",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user account should open",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks onlogout",
  "keyword": "Then "
});
formatter.match({
  "location": "Festicketlogin.user_is_already_on_Homepage()"
});
formatter.result({
  "duration": 6985610857,
  "status": "passed"
});
formatter.match({
  "location": "Festicketlogin.title_of_page_is_Festival_Tickets()"
});
formatter.result({
  "duration": 7036262548,
  "status": "passed"
});
formatter.match({
  "location": "Festicketlogin.user_clicks_on_Login()"
});
formatter.result({
  "duration": 113072363,
  "status": "passed"
});
formatter.match({
  "location": "Festicketlogin.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 5684221535,
  "status": "passed"
});
formatter.match({
  "location": "Festicketlogin.user_account_should_open()"
});
formatter.result({
  "duration": 112488641,
  "status": "passed"
});
formatter.match({
  "location": "Festicketlogin.user_clicks_onlogout()"
});
formatter.result({
  "duration": 2315562149,
  "status": "passed"
});
});