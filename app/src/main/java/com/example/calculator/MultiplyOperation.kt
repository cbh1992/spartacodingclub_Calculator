package com.example.calculator
//곱하기
class MultiplyOperation {
    fun operate(num1:Double,num2:Double): String {

        var result: String
        result = (num1*num2).toString()
        return result
    }
}