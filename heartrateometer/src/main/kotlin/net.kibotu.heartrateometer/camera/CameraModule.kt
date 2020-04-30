package net.kibotu.heartrateometer.camera

import android.content.Context

object CameraModule {


    fun provideCameraSupport(context: Context): CameraSupport {
//        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            CameraPostLolipop(context)
//        } else {
        return CameraPreLolipop()
//        }
    }
}