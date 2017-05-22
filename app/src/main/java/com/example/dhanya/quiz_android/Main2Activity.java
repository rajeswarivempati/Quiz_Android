package com.example.dhanya.quiz_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {
    public static final String Extramessage = "hai";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Result(View view) {
        EditText a1 = (EditText) findViewById(R.id.a1);
        EditText a2 = (EditText) findViewById(R.id.a2);
        EditText a3 = (EditText) findViewById(R.id.a3);
        EditText a4 = (EditText) findViewById(R.id.a4);
        EditText a5 = (EditText) findViewById(R.id.a5);
        EditText a6 = (EditText) findViewById(R.id.a6);
        EditText a7 = (EditText) findViewById(R.id.a7);
        RadioGroup radiogroup1 = (RadioGroup) findViewById(R.id.eight);
        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.nine);
        RadioGroup radiogroup3 = (RadioGroup) findViewById(R.id.ten);

      int result = 0;
        if (a1.getText().toString().equalsIgnoreCase("Nougat")) {
            result = result + 1;
        }
        if (a2.getText().toString().equalsIgnoreCase("Java")) {
            result = result + 1;
        }
        if (a3.getText().toString().equalsIgnoreCase("Android")) {
            result = result + 1;
        }
        if (a4.getText().toString().equalsIgnoreCase("Google")) {
            result = result + 1;
        }
        if (a5.getText().toString().equalsIgnoreCase("Android Debug Bridge")) {
            result = result + 1;
        }
        if (a6.getText().toString().equalsIgnoreCase("Extensible Markup Language")) {
            result = result + 1;
        }
        if (a7.getText().toString().equalsIgnoreCase("Integrated Development Environment")) {
            result = result + 1;
        }
        int selectedId = radiogroup1.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        if (radioButton.getText().toString().equalsIgnoreCase("All of the Above")) {
            result = result + 1;
        }
        int selectedId1 = radiogroup2.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioButton1 = (RadioButton) findViewById(selectedId1);
        if (radioButton1.getText().toString().equalsIgnoreCase("AVI")) ;
        {
            result = result + 1;
        }
        int selectedId2 = radiogroup3.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton radioButton2 = (RadioButton) findViewById(selectedId2);
        if (radioButton2.getText().toString().equalsIgnoreCase("Linux Kernel")) {
            result = result + 1;
        }
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        intent.putExtra(Extramessage, "" +result);
        startActivity(intent);


    }
}
