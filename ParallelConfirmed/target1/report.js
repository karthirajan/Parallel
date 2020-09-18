$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/K_ThemeCreation.feature");
formatter.feature({
  "name": "Theme creation and validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Selenium"
    },
    {
      "name": "@Theme"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Theme creation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launches centric application",
  "keyword": "Given "
});
formatter.step({
  "name": "Go to homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "verify user screen",
  "keyword": "And "
});
formatter.step({
  "name": "User creates theme for single season \"TM-Single Season\",\"Wild Theme Master\",\"Wild Theme\",\"winter season\"",
  "keyword": "When "
});
formatter.step({
  "name": "User creates new theme from style \"\u003cStyleSubType\u003e\",\"\u003cStyleTM\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User creates new theme from material \"\u003cMaterialSubType\u003e\",\"\u003cMaterialTM\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User creates theme for All season \"TM-All Season\",\"All season TM\",\"All season - Theme\"",
  "keyword": "And "
});
formatter.step({
  "name": "User is performing theme copy,edit and delete action",
  "keyword": "And "
});
formatter.step({
  "name": "User creates Security group \"\u003cSecurityGrp\u003e\" and update values under Theme \"TSG\"",
  "keyword": "And "
});
formatter.step({
  "name": "User creates color inside theme \"Blue Theme\",\"White Theme\",\"Glass Theme\"",
  "keyword": "And "
});
formatter.step({
  "name": "User creates product alternative \"Italy\"",
  "keyword": "And "
});
formatter.step({
  "name": "Logout from the Application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "StyleSubType",
        "StyleTM",
        "MaterialSubType",
        "MaterialTM",
        "SecurityGrp"
      ]
    },
    {
      "cells": [
        "TM-Allow material variation",
        "Style Theme Master",
        "TM-Multiple Season",
        "Material Theme Master",
        "TSG -All"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Theme creation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Selenium"
    },
    {
      "name": "@Theme"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches centric application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_centric_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.go_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.verify_user_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates theme for single season \"TM-Single Season\",\"Wild Theme Master\",\"Wild Theme\",\"winter season\"",
  "keyword": "When "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_theme_for_single_season(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates new theme from style \"TM-Allow material variation\",\"Style Theme Master\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_new_theme_from_style(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//td[contains(text(),\u0027EGRET\u0027)]//preceding-sibling::td)//input\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENORIG-500GBSS\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:59310}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d5a26d931f682c9fc4270ccc69f3d5b5\n*** Element info: {Using\u003dxpath, value\u003d(//td[contains(text(),\u0027EGRET\u0027)]//preceding-sibling::td)//input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.centric.resources.Commonactions.click(Commonactions.java:100)\r\n\tat com.centric.stepdefinition.StyleandThemePageSteps.user_creates_new_theme_from_style(StyleandThemePageSteps.java:617)\r\n\tat ✽.User creates new theme from style \"TM-Allow material variation\",\"Style Theme Master\"(src/test/resources/Features/K_ThemeCreation.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User creates new theme from material \"TM-Multiple Season\",\"Material Theme Master\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_new_theme_from_material(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User creates theme for All season \"TM-All Season\",\"All season TM\",\"All season - Theme\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_theme_for_All_season(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is performing theme copy,edit and delete action",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_is_performing_theme_copy_edit_and_delete_action()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User creates Security group \"TSG -All\" and update values under Theme \"TSG\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_Security_group_and_update_values_under_Theme(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User creates color inside theme \"Blue Theme\",\"White Theme\",\"Glass Theme\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_color_inside_theme(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User creates product alternative \"Italy\"",
  "keyword": "And "
});
formatter.match({
  "location": "StyleandThemePageSteps.user_creates_product_alternative(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout from the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.logout_from_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});