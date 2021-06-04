package com.sandona.gitlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("dev first changes")
        print("dev first changes amend")

        Toast.makeText(this,"Welcome soro",Toast.LENGTH_LONG).show()
    }
}
