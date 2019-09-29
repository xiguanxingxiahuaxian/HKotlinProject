package com.own.hkotlinproject.daybyday

//变量的声明与使用
/**
 * 显式声明类型
 *
 * val 不能修改的值
 */
fun main(args:Array<String>){
    var i:Int=18;
    i=99999; //999999999999自动类型推断 太大

    var j=1999999999999 //自动判断为长整形

    val no=12;
}