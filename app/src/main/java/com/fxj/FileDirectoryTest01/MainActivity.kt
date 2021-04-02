package com.fxj.FileDirectoryTest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG=MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtn01Click(view: View) {
        var getDirPath= view.context.getDir("libs", MODE_PRIVATE).absolutePath;
        Log.d(TAG,"##onBtn01Click##context.getDir(\"libs\", MODE_PRIVATE)=${getDirPath}")
    }

    fun onBtn02Click(view: View) {
        var getFileDirPath=view.context.getFilesDir().absolutePath;
        Log.d(TAG,"##onBtn02Click##context.getFilesDir()=${getFileDirPath}")
    }

    fun onBtn03Click(view: View) {
        var getCacheDirPath=view.context.getCacheDir().absolutePath;
        Log.d(TAG,"##onBtn03Click##context.getCacheDir()=${getCacheDirPath}")
    }
}