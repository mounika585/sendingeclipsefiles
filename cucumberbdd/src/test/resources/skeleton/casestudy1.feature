Feature: Test me app Registration
Scenario: Valid Login For Test me app

    Given The URL of the Test me app "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
    When User enters "mounika1" as UserName
    And User enters "mouni" as FirstName
    And User enters "ch" as LastName
    And User enters "mounika" as Password
    And User enters "mounika" as ConfirmPassword
    And User enters "female" as Gender
    And User enters "mounika@gmail.com" as EmailAddress
    And User enters "9876564321" as MobileNumber
    And User enters "02/09/1996" as Dob
    And User enters "bangalore" as Address
    And User enters "What is your Birth Place?" as SecurityQuestion
    And User enters "gudur" as Answer
    Then clicks on Submit ButtoN
    