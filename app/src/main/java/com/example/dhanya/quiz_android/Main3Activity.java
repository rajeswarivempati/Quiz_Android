package com.example.dhanya.quiz_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView txt=(TextView) findViewById(R.id.score2);
        Intent intent=getIntent();
        String message=intent.getStringExtra(Main2Activity.Extramessage);
        txt.setText(message);
    }

}
