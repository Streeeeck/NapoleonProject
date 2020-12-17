package com.example.napoleonproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lastnews.*


class LastNewsActivity: AppCompatActivity() {
    private val TAG = "LastNewsActivity"
     lateinit var oneN : OneNews


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lastnews)
        oneN = intent.extras?.getSerializable("oneN") as OneNews
        TWDate.text = oneN.date
        TWRes.text = oneN.res
        TWHead.text = oneN.head
        TWText.text = oneN.text

    }

    override fun finish() {
        val intent = Intent()
        intent.putExtra("checked", true)
        intent.putExtra("id", oneN )
        setResult(Activity.RESULT_OK, intent)
        super.finish()
    }






    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")
    }

}