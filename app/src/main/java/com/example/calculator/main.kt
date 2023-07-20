package com.example.calculator

fun main() {

    println("숫자와 연산자를 입력해 주세요.나눗셈의 나머지를 구하는 연산자는 %입니다")
    var num1 = readLine()!!.toDouble()
    var oper = readLine()!!.toString()
    var num2 = readLine()!!.toDouble()

    var calc = Calculator()

    println("계산 결과 ${calc.operate(num1, oper, num2)}")

}