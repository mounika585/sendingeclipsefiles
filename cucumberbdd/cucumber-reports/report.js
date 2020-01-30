$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/demoWebShop.feature");
formatter.feature({
  "name": "Demo Web Shop Login feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "askmail@email.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@ymail.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demoWebShop.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@email.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demoWebShop.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@ymail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demoWebShop.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demoWebShop.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
});