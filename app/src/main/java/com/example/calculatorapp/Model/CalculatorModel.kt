package com.example.calculatorapp.Model

class CalculatorModel {
    private var expression: String = ""

    fun addInput(input: String) {
        expression += input
    }

    fun calculateResult(): String {
        return try {
            val result = ExpressionBuilder(expression).build().evaluate()
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }

    fun clear() {
        expression = ""
    }

    fun getExpression(): String {
        return expression
    }
}