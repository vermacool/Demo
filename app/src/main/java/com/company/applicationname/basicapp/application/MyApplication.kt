package com.company.applicationname.basicapp.application

import android.app.Application
import android.content.Context

/**
 * Created by Manish on 2/3/2018.
 * All rights reserved by Skedsoft
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }


}