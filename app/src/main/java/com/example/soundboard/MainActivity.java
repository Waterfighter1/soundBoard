package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btn1, btn2, btn3;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageView) findViewById(R.id.btn_1);
        btn1.setOnClickListener(playMusic);

        btn2 = (ImageView) findViewById(R.id.btn_2);
        btn2.setOnClickListener(playMusic);

        btn3 = (ImageView) findViewById(R.id.btn_3);
        btn3.setOnClickListener(playMusic);

    }

    View.OnClickListener playMusic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_1:
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }

                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound1);
                    mediaPlayer.start();
                    break;
                case R.id.btn_2:
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound2);
                    mediaPlayer.start();
                    break;
                case R.id.btn_3:
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound3);
                    mediaPlayer.start();
                    break;
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}