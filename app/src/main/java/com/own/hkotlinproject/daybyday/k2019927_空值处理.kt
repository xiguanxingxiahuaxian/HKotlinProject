package com.own.hkotlinproject.daybyday

//空值处理
fun main(args:Array<String>){
  heat("水")
  heat(null);
}
//加上？参数可以为空
fun heat(str:String?):String{
    return "热"+str
}