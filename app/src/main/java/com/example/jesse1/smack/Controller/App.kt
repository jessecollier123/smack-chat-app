package com.example.jesse1.smack.Controller

import android.app.Application
import com.example.jesse1.smack.Utilities.SharedPrefs

//access this from anywhere in the app and save an persist the data from isLoggedIn and userEmail
class App : Application() {

    //like a singleton but inside a specific class
    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}