# Author: Julian Eduardo Avila Tascon
@stories
Feature: User Creation, as a user I want to register in the uTest community
  @scenario
  Scenario Outline: register a user in the uTest community
    Given Julian enters the Join today option
    When he fill in the form fields in Step one
    | strFirstName | strLastName | strEmail | strBirthMonth | strBirthDay | strBirthYear | strLanguage |
    | <strFirstName> | <strLastName> | <strEmail> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strLanguage> |
    And he fill in the fields in Step two
    | strCity | strZip |
    | <strCity> | <strZip> |
    And he fill in the fields in Step three
    | strMobilDevice | strModel | strOs |
    | <strMobilDevice> | <strModel> | <strOs> |
    And he fill in the fields in Step four
    | strPassword | strPaswordConfirm |
    | <strPassword> | <strPaswordConfirm> |
    Then julian receives a welcome message to the uTest community
    | strMessage |
    | <strMessage> |
    Examples:
      | strFirstName | strLastName | strEmail | strBirthMonth | strBirthDay | strBirthYear | strLanguage | strCity | strZip | strMobilDevice | strModel | strOs | strPassword | strPaswordConfirm | strMessage |
      | Julian Eduardo | Avila Tascon | avilatas12326@gmail.com | March | 26 | 1984 | Spanish | Santa Marta | 763022 | Motorola | Moto E7 Plus | Android 10 | Choucair2021* | Choucair2021* | Welcome to the world's largest community of freelance software testers! |




