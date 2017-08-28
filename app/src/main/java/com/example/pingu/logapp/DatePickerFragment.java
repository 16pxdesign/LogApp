package com.example.pingu.logapp;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;



public class DatePickerFragment extends DialogFragment implements DataSender {


    private Calendar c = Calendar.getInstance();
    private int year = c.get(Calendar.YEAR);
    private int month = c.get(Calendar.MONTH);
    private int day = c.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog builder;
    private String dateString;
    private EditText button;

    @Override
    public void sendButton(Object button) {
        this.button = (EditText) button;

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {



        builder = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                i1 = i1 + 1;
                dateString = i2 + "/" + i1 + "/" + i;
                /*passData = (PassDateFromFragment) getActivity();
                passData.passedData(dateString);*/
                button.setText(dateString);

            }
        }, year, month, day);

        return builder;
    }



}
