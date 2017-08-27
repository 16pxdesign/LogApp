package com.example.pingu.logapp;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;



public class DatePickerFragment extends DialogFragment {


    private Calendar c = Calendar.getInstance();
    private int year = c.get(Calendar.YEAR);
    private int month = c.get(Calendar.MONTH);
    private int day = c.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog builder;
    PassDateFromFragment passData;

    protected interface PassDateFromFragment {
        void passedData(String data);
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        builder = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                i1 = i1 + 1;
                String dateString = i2 + "/" + i1 + "/" + i;
                passData = (PassDateFromFragment) getActivity();
                passData.passedData(dateString);
            }
        }, year, month, day);
        builder.getDatePicker().setTag(getTag());

        return builder;
    }


}
