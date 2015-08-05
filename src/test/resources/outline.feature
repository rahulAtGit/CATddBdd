Feature: RPNCalculator

Scenario: Caclculator functions
		Perform postfix expression evaluation.

Scenario Outline: Addition and Multiplication
	Given input <expression>
	When click "submit"
	Then output should be <result>
	
Examples: 
	| expression | result |
	| "1 2 3 + -"  |   "-4.0"   |
	| "6 2 * 3 /"  |    "4.0"   |
	|"2 3 ^ 4 5 + +" | "17.0" |
	|"50 % 2 *"| "1.0" |
	|"3 ! 4 5 * +" | "26.0" |
	|"12 3 / !" | "24.0" |
	|"5 1 2 + 4 * + 3 -"|"14.0"|