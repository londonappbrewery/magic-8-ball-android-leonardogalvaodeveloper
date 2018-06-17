package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FIELDS
        Button askButton = findViewById(R.id.askButton);
        final ImageView eightBallImage = findViewById(R.id.eightBallImage);

        final int[] eightBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // METHODS
        askButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(4);
                eightBallImage.setImageResource(eightBallArray[randomNumber]);
            }
        });
    }
}
