package com.example.calculator
//빼기
class SubstractOperation {
    fun operate(num1:Double,num2:Double): String {

        var result: String
        result = (num1-num2).toString()
        return result
    }
}