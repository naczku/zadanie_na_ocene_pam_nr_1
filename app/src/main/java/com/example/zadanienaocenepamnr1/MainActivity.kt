package com.example.zadanienaocenepamnr1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*
import androidx.core.app.NotificationCompatExtras

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obraz = findViewById<ImageView>(R.id.obraz)
        val Next = findViewById<ImageButton>(R.id.Next)
        val previous = findViewById<ImageButton>(R.id.previous)

        var img = "PeterGriffin"
        Next.setOnClickListener {
            if (img == "PeterGriffin") {
                obraz.setImageResource(R.drawable.face)
                img = "face"
            } else if (img == "face") {
                obraz.setImageResource(R.drawable.Kowalski)
                img = "Kowalski"
            } else if (img == "Kowalski") {
                obraz.setImageResource(R.drawable.homer_simspon)
                img = "homersimpson"
            } else if (img == "homersimpson") {
                obraz.setImageResource(R.drawable.PeterGriffin)
                img = "PeterGriffin"

            }

        }
        previous.setOnClickListener{
            if (img == "PeterGriffin") {
                obraz.setImageResource(R.drawable.homer_simspon)
                img = "homersimpson"
            } else if (img == "homersimpson") {
                obraz.setImageResource(R.drawable.Kowalski)
                img = "Kowalski"
            } else if (img == "Kowalski") {
                obraz.setImageResource(R.drawable.face)
                img = "face"
            } else if (img == "face") {
                obraz.setImageResource(R.drawable.PeterGriffin)
                img = "PeterGriffin"

            }
        }

    }
}