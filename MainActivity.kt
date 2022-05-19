package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
fun main(args: Array<String>) {
// фибоначчи
    var t1 = 0
    var t2 = 1
    var i = 20

    while (t1 >= 0) {
        if (i == 0) {
            break
        }
        println(t1)
        val sum = t1 + t2
        t1 = t2
        t2 = sum
        i--
    }
    //рандомные числа
    val random1 = Util()
    println(random1.Sum())
    println()



    


}




