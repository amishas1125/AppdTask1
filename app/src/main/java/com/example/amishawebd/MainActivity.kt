package com.example.amishawebd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        val name:EditText=findViewById(R.id.enter_name)
        val age:EditText=findViewById(R.id.enter_age)
        btn.setOnClickListener(View.OnClickListener {
           val names=name.text.toString()
           val ages=age.text.toString()
            if (names!=""){
                Toast.makeText(this, "Hii! I am $names \nGo omicron Go!",Toast.LENGTH_LONG).show()
                name.setText("")
                age.setText("")
            }
            else {
                Toast.makeText(this, "Please enter your name",Toast.LENGTH_SHORT).show()
            }
        })
    }
}