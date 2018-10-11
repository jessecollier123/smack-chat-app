package com.example.jesse1.smack.Services

import android.graphics.Color
import com.example.jesse1.smack.Controller.App
import java.util.*

object UserDataService {

    var id = ""
    var avatar = ""
    var avatarName = ""
    var avatarColor = ""
    var email = ""
    var name = ""

    fun logout() {
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
    }

    //return the color generated to the login flyout(int value)
    fun returnAvatarColor(components: String) : Int {
        //colors come in from MLab as: [#.###, #.###, #.###], so we need to strip all non-numbers
        val strippedColor = components
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if (scanner.hasNext()) {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }

        return Color.rgb(r,g,b)

    }
}