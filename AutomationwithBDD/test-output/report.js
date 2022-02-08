$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Signin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps_loginpage.user_Launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open the URL \"https://collaborationdevi.premierinc.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps_loginpage.user_open_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the name as \"chope\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps_loginpage.user_enter_the_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps_loginpage.user_click_the_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password  as \"Premier1\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps_loginpage.user_enter_the_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps_loginpage.user_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps_loginpage.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});