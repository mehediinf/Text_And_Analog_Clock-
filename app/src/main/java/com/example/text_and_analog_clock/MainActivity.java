package com.example.text_and_analog_clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextClock textClock;
    private AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogClock_Id);
        textClock = findViewById(R.id.textClock_Id);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.analogClock_Id){
            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.textClock_Id){
            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }
    }
}