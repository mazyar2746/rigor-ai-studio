package com.rigor.aistudio

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "RigorCameraPro اجرا شد", Toast.LENGTH_SHORT).show()
    }
}