package com.tarasov_denis.code_samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view)
        val fragment = TestFragment()
       // fragment.beginT
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_view, fragment)
            commit()
        }
               //fragment_container_view, R.id.test_fragment)
           //.commit()

    }
}