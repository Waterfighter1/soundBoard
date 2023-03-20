package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Predefine the media player and all of the buttons
    ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare each buton by finding their Component and adding an on click listener
        btn1 = (ImageView) findViewById(R.id.btn_1);
        btn1.setOnClickListener(playMusic);

        btn2 = (ImageView) findViewById(R.id.btn_2);
        btn2.setOnClickListener(playMusic);

        btn3 = (ImageView) findViewById(R.id.btn_3);
        btn3.setOnClickListener(playMusic);

        btn4 = (ImageView) findViewById(R.id.btn_4);
        btn4.setOnClickListener(playMusic);

        btn5 = (ImageView) findViewById(R.id.btn_5);
        btn5.setOnClickListener(playMusic);

        btn6 = (ImageView) findViewById(R.id.btn_6);
        btn6.setOnClickListener(playMusic);

        btn7 = (ImageView) findViewById(R.id.btn_7);
        btn7.setOnClickListener(playMusic);

        btn8 = (ImageView) findViewById(R.id.btn_8);
        btn8.setOnClickListener(playMusic);

        btn9 = (ImageView) findViewById(R.id.btn_9);
        btn9.setOnClickListener(playMusic);

        btn10 = (ImageView) findViewById(R.id.btn_10);
        btn10.setOnClickListener(playMusic);

    }

    // Defining the PlayMusic Listener
    View.OnClickListener playMusic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Stop the previously playing sound
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }

            // Switch depending on what button was clicked.
            // Depending on which button, it plays it respective sound
            switch (v.getId()) {
                case R.id.btn_1:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound1);
                    break;
                case R.id.btn_2:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound2);
                    break;
                case R.id.btn_3:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound3);
                    break;
                case R.id.btn_4:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound4);
                    break;
                case R.id.btn_5:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound5);
                    break;
                case R.id.btn_6:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound6);
                    break;
                case R.id.btn_7:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound7);
                    break;
                case R.id.btn_8:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound8);
                    break;
                case R.id.btn_9:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound9);
                    break;

                case R.id.btn_10:
                    mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.sound10);
                    break;
            }
            // Start The SOUND (must be done for each button, so I have it do it outside of the switch
            mediaPlayer.start();
        }
    };

    // On destroy release the media player as to not take up memory!
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}