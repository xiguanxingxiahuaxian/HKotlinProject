package com.own.hkotlinproject.daybyday

import java.util.*

//list
fun main(args:Array<String>){
    var lsit=listOf<Int>(1,2)
    for((i,e)in lsit.withIndex()){
        print("$i $e")
    }

    //map
    var map=TreeMap<String,String>()
    map["1"]="好"
    
}