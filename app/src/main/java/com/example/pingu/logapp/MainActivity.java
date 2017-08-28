package com.example.pingu.logapp;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DataSender sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addShifht = (Button) findViewById(R.id.addShift);
        final Button dwa = (Button) findViewById(R.id.dwa);


        addShifht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addShift = new Intent(getApplicationContext(),AddShiftActivity.class);
                startActivity(addShift);
            }
        });





    }
}
