package com.cis.lab.liststudent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        profile.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            profile2.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)


                profile3.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                    profile4.setOnClickListener {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    }
                }
            }
        }
    }
}

