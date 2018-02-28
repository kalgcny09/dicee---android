package com.danieleoliva.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        rollButton = (Button) findViewById(R.id.rollbutton);


        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dicee", "Button has been Pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("Dicee", "The random Number is: " + number);



            }
        });

//        Everytime the roll button is clicked the code in between OnClick will run.

    }
}
