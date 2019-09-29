package com.own.hkotlinproject.daybyday

//变量的声明与使用
fun main(args:Array<String>){
  diaryGenerater("中山")
}

fun diaryGenerater(str:String):String{
    var temple="" +
            "11111111111" +
            "+${str}"
    return temple;
}