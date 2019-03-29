package com.e.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnFirst, btnSecond;
    private TextView tvResult;
    private int counter=0;
    private int win=0;
    private int loose=0;
    private  int randomFirst, randomSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        tvResult = findViewById(R.id.tvResult);
        

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomFirst = (int)(Math.random()*100)+1;
                btnFirst.setText(Integer.toString(randomFirst));
                randomSecond = (int)(Math.random()*100)+1;


                btnSecond.setText(Integer.toString(randomSecond));
                if (counter<10){
                    if (randomFirst>randomSecond){
                        counter = counter+1;
                        win = win+1;

                    }else {
                        counter = counter+1;
                        loose=loose+1;
                        win= win-1;
                    }
                }else tvResult.setText("win points" + win + "loose points"+loose);
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomFirst = (int)(Math.random()*100)+1;
                btnFirst.setText(Integer.toString(randomFirst));
                randomSecond = (int)(Math.random()*100)+1;


                btnSecond.setText(Integer.toString(randomSecond));
                if (counter<10){
                    if (randomSecond>randomFirst){
                        counter = counter+1;
                        win = win+1;

                    }else {
                        counter = counter+1;
                        loose=loose+1;
                        win= win-1;
                    }
                }else tvResult.setText("win points" + win + "loose points"+loose);
            }
        });

    }
}
