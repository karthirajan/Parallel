#Author: karthick@kripya.com
@Selenium @Theme
Feature: Theme creation and validation

  Scenario Outline: Theme creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates theme for single season "TM-Single Season","Wild Theme Master","Wild Theme","winter season"
    And User creates new theme from style "<StyleSubType>","<StyleTM>"
    And User creates new theme from material "<MaterialSubType>","<MaterialTM>"
    And User creates theme for All season "TM-All Season","All season TM","All season - Theme"
    And User is performing theme copy,edit and delete action
    And User creates Security group "<SecurityGrp>" and update values under Theme "TSG"
    And User creates color inside theme "Blue Theme","White Theme","Glass Theme"
    And User creates product alternative "Italy"
    Then Logout from the Application

    Examples: 
      | StyleSubType                | StyleTM            | MaterialSubType    | MaterialTM            | SecurityGrp |
      | TM-Allow material variation | Style Theme Master | TM-Multiple Season | Material Theme Master | TSG -All    |
