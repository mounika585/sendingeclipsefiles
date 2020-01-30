Feature: Logining into the test me app

  Scenario Outline: Valid Login For Test Me App
    Given The URL of The Demo Web Shop "http://10.232.237.143:443/TestMeApp/login.htm"
    When User enters "<username>" as Username
    And User enters "<password>" as passWord
    Then User clicks on login Button
	  And clicks on search bar
    And click on finddetails
 		And displays that Product details
 		 

  Examples: 
      | username | password |
      | mounika1 | mounika  |