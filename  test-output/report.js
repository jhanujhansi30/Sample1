$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Ebay Application",
  "description": "",
  "id": "ebay-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Click Advanced Search",
  "description": "",
  "id": "ebay-application;click-advanced-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on ebay Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I clicked on the click",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to the Serach page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.i_am_on_ebay_Application()"
});
formatter.result({
  "duration": 10561817475,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.i_clicked_on_the_click()"
});
formatter.result({
  "duration": 5830149730,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.i_should_navigate_to_the_Serach_page()"
});
formatter.result({
  "duration": 23821114,
  "status": "passed"
});
});