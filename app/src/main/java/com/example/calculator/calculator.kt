package com.example.calculator

class Calculator {
    fun operate(num1:Double,oper:String,num2:Double): String {

        var add = AddOperation()
        var sub = SubstractOperation()
        var mul = MultiplyOperation()
        var div = DivideOperation()
        var els = Eelse()
        var result:String

        when(oper) {
            "+"->result = (add.operate(num1, num2))
            "-"->result = (sub.operate (num1, num2))
            "*"->result = (mul.operate(num1, num2))
            "/"->result = (div.operate(num1, num2))
            "%"->result = (num1 % num2).toString()
            else->result = (els.operate(num1, num2))
        }
        return result
    }
}