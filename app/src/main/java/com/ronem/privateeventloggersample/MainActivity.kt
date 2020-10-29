package com.ronem.privateeventloggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ronem.privatelogcat.GPSUtils
import com.ronem.privatelogcat.showMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCheckGPS?.setOnClickListener {
            if (GPSUtils.isGpsEnabled(this)){
                showMessage("Yes, GPS is enabled")
            }else{
                showMessage("Yes, GPS is disabled")
            }
        }
    }
}
