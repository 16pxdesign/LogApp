package com.example.pingu.logapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addShifht = (Button) findViewById(R.id.addShift);
        TextView dwa = (TextView) findViewById(R.id.dwa);
        Log.d("gg", "gg");



        addShifht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addShift = new Intent(getApplicationContext(),AddShiftActivity.class);
                startActivity(addShift);
            }
        });


    }
}
