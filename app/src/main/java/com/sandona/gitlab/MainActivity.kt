package com.sandona.gitlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("dev first changes")
        print("dev first changes amend")
    }

    fun add(num1:Int,num2:Int):Int{
        return num1+num2;
    }
    fun division(num1:Int,num2:Int):Int{
        return num1/num2;
    }
    fun modulo(num1:Int,num2:Int):Int{
        return num1%num2;
    }
}
