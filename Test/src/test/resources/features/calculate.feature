#Autor: milena.gonzalez

  Feature: Make an operation
    I want to make an operation in the Calculator

  Scenario: Make a sum in the Calculator
    Given that I want to make a sum
    When I sum two numbers
    Then I will see that the result is equals to 8