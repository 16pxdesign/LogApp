package com.example.pingu.logapp;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;


/**
 * Created by pingu on 8/25/2017.
 */

public class DatePickerFragment extends DialogFragment  {


    private Calendar c = Calendar.getInstance();
    private int year = c.get(Calendar.YEAR);
    private int month = c.get(Calendar.MONTH);
    private int day = c.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog builder;
    MyInterface myInterface;
    public interface MyInterface{
        void printData(String data);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    myInterface.printData("Hello");



        builder = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                String editTextName = builder.getDatePicker().getTag().toString();
                int resId = getResources().getIdentifier(editTextName, "id", getActivity().getPackageName());
                EditText date = (EditText) getActivity().findViewById(resId);
                i1=i1+1;
                String dateString = i2+"/"+i1+"/"+i;
                date.setText(dateString);
            }
        }, year, month, day);
        builder.getDatePicker().setTag(getTag());

        return builder;
    }




}
