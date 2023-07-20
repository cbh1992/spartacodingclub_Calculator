package com.example.calculator
//더하기
class AddOperation {
    fun operate(num1:Double,num2:Double): String {

        var result: String
        result = (num1+num2).toString()
        return result
    }
}