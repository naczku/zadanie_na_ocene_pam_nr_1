package com.example.zadanienaocenepamnr1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.webkit.RenderProcessGoneDetail
import android.widget.*
import androidx.core.app.NotificationCompatExtras
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obraz = findViewById<ImageView>(R.id.imageView)
        val Next = findViewById<ImageButton>(R.id.Next)
        val previous = findViewById<ImageButton>(R.id.previous)
        val przelacznik = findViewById<CheckBox>(R.id.przelacznik)

        var img = "person"
        Next.setOnClickListener {
            if (img == "person") {
                obraz.setImageResource(R.drawable.face)
                img = "face"
            } else if (img == "face") {
                obraz.setImageResource(R.drawable.splat)
                img = "splat"
            } else if (img == "splat") {
                obraz.setImageResource(R.drawable.homer_simspon)
                img = "homersimpson"
            } else if (img == "homersimpson") {
                obraz.setImageResource(R.drawable.person)
                img = "person"

            }

        }
        previous.setOnClickListener{
            if (img == "person") {
                obraz.setImageResource(R.drawable.homer_simspon)
                img = "homersimpson"
            } else if (img == "homersimpson") {
                obraz.setImageResource(R.drawable.splat)
                img = "splat"
            } else if (img == "splat") {
                obraz.setImageResource(R.drawable.face)
                img = "face"
            } else if (img == "face") {
                obraz.setImageResource(R.drawable.person)
                img = "person"

            }
        }

        if (przelacznik.isChecked) {
            if(obraz.isVisible == true){

            }
            else{

            }

        }


    }
}