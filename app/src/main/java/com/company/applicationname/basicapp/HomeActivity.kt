package com.company.applicationname.basicapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.company.applicationname.basicapp.utils.InternetCheck
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        checkInternet.setOnClickListener {
            InternetCheck { internet ->
                if(internet){
                    TODO("has internet connection")
                }else{
                    Toast.makeText(applicationContext,"no internet",Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}
