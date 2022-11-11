package com.example.githubsearchrepository

import androidx.fragment.app.Fragment

interface Navigator {

    fun openAboutApp()

}

fun Fragment.navigate(): Navigator {
    return requireActivity() as Navigator
}