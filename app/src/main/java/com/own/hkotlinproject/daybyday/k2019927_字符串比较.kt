package com.own.hkotlinproject.daybyday

//字符串比较
fun main(args:Array<String>){
   var  str1="张三";
    var str2="李四";
    print(str1==str2) //true?  java是比较内存地址，==相当于java的equals
    str1.equals(str2,true)//忽略大小写

}