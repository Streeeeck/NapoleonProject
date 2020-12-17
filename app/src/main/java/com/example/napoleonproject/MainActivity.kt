package com.example.napoleonproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var news = News()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        news.Testinit()

        etm.text = Editable.Factory.getInstance().newEditable(news.toString())


    }

    override fun onPause() {
        super.onPause()
    }



}