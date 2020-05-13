package com.example.androiddrawableimporterpluginex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dishapatani.setOnClickListener {

            Toast.makeText(this,"Android Drawable Importor PlugInEx, pic:Disha Patani",Toast.LENGTH_LONG).show()
        }

    }
}
