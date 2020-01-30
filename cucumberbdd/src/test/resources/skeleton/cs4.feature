Feature: Logining into the test me app

  Scenario Outline: Valid Login For Test Me App
    Given the URL of The Demo Web Shop "http://10.232.237.143:443/TestMeApp/login.htm"
    When User Enters "<username>" as Username
    And User Enters "<password>" as passWord
    Then User Clicks on login Button
	  And clicks on Search bar
    And click on Finddetails
 		And displays That Product details
 		And try to Click on proceed
 		
  Examples: 
      | username | password |
      | mounika1 | mounika  |