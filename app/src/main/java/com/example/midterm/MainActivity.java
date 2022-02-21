package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    int playing;
    MediaPlayer mediaPlayer;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(button);
        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(button2);
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(this, R.raw.track);
        playing = 0;
    }

    View.OnClickListener button = new View.OnClickListener() {
        @Override
        public void onClick(View view){
            switch(playing) {
                case 0:
                    mediaPlayer.start();
                    playing = 1;
                    button.setText("Pause");
                    break;
                case 1:
                    mediaPlayer.pause();
                    playing = 0;
                    button2.setText("Resume");
                    break;
        }
    }
}