package com.example.pingu.logapp;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

import android.support.v4.app.FragmentActivity;


public class AddShiftActivity extends FragmentActivity implements DatePickerFragment.MyInterface{

    private DatePickerDialog.OnDateSetListener dateListener;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shift);
        final EditText date = (EditText) findViewById(R.id.editTextDate);
        date.setInputType(InputType.TYPE_NULL);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment d = new DatePickerFragment();
                d.show(getFragmentManager(),"editTextDate");


            }
        });






    }


    @Override
    public void printData(String data) {

    }
}
