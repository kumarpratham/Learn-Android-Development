package com.example.videoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vv1 : VideoView = findViewById(R.id.vv1)
        vv1.setVideoPath("android.resource://" + packageName + "/" + R.raw.video)

        val mediaController = MediaController(this)

        mediaController.setAnchorView(vv1)
        mediaController.setMediaPlayer(vv1)
        vv1.setMediaController(mediaController)
    }
}