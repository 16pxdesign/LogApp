package com.example.pingu.logapp;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;


public class AddShiftActivity extends FragmentActivity {

    EditText date,start,end;
    Button test;
    private DataSender dataSender;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shift);
        date = (EditText) findViewById(R.id.editTextDate);
        start = (EditText) findViewById(R.id.editTextStart);
        end = (EditText) findViewById(R.id.editTextEnd);
        test = (Button) findViewById(R.id.test);

        date.setInputType(InputType.TYPE_NULL);
        start.setInputType(InputType.TYPE_NULL);
        end.setInputType(InputType.TYPE_NULL);


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DialogFragment d = new DatePickerFragment();
                        dataSender = (DataSender) d;

                        d.show(getFragmentManager(), "Test");

                        dataSender.sendButton(date);

                    }
                });


            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment d = new TimePickerFragment();
                dataSender = (DataSender) d;
                dataSender.sendButton(start);
                d.show(getFragmentManager(),"Timepiker");


            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment d = new TimePickerFragment();
                dataSender = (DataSender) d;
                dataSender.sendButton(end);
                d.show(getFragmentManager(),"Timepiker");


            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = start.getText().toString();
                Toast.makeText(getApplicationContext(),temp,Toast.LENGTH_LONG).show();
            }
        });



    }


}
