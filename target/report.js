$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Demo.feature");
formatter.feature({
  "name": "Add customer module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add customer flow validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hardcoded"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches telecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_launches_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer",
  "keyword": "And "
});
formatter.match({
  "location": "Addcustomer.user_click_on_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter values in fields",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.user_enter_values_in_fields()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#addr\"}\n  (Session info: chrome\u003d88.0.4324.190)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HP-PC\u0027, ip: \u0027192.168.0.118\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:51343}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0f6b2e27627b3e8b44d0de5785324ba6\n*** Element info: {Using\u003did, value\u003daddr}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.telecom.resources.CommonActions.write(CommonActions.java:19)\r\n\tat com.telecom.stepdefinition.Addcustomer.user_enter_values_in_fields(Addcustomer.java:42)\r\n\tat ✽.user enter values in fields(src/test/resources/features/Demo.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Addcustomer.user_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user shoukld be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.user_shoukld_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});