package com.example.hw1



open class RandomData(val x1: Int = (0..20).random(), val y1: Int = (0..20).random()) {

        }
open class DataEmp: RandomData(){
    }
class Util : DataEmp() {
    fun Sum () : Int {
        val Sum = x1 + y1
        return Sum
    }





    }
