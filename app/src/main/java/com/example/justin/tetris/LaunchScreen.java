package com.example.justin.tetris;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LaunchScreen extends AppCompatActivity {

    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        // Janky animation of start button.
        final ImageButton bv = (ImageButton) findViewById(R.id.startButton);
        r = new Runnable(){
            int i = 1;
            public void run(){
                i++;
                if (i % 2 == 0) {
                    bv.setImageResource(R.drawable.start1);
                } else {
                    bv.setImageResource(R.drawable.start2);
                }
                bv.postDelayed(r, 500); //set to go off again in 3 seconds.
            }
        };
        bv.postDelayed(r,500); // set first time for 3 seconds
    }

    public void startGame(View view) {
        Intent intent = new Intent(this,GamePlay.class);
        startActivity(intent);
    }


}
