 package com.example.edycjatekstu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnimie).setOnClickListener {
            findViewById<EditText>(R.id.multilinia).setText(R.string.MultiLinia);
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<EditText>(R.id.jednalinia).setText(R.string.PojedynczaLinia);
        }
    }
}