package com.alexandrestefani.videostudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView= findViewById(R.id.videoView);

        //esconder a barra
        getSupportActionBar().hide();

        //comando para acionar os controles do video
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoView.start();

    }
}