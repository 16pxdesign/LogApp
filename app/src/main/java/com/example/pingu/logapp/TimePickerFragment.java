package com.example.pingu.logapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by pingu on 8/27/2017.
 */
/*interface PassTimeFromFragment{
    void passedData(String data);
}*/

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener, DataSender {
    Dialog builder;
    TextView textView;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        builder = new TimePickerDialog(getActivity(),this,hour,minute,true);
        return builder;
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

        String tempTime = i + ":"+i1;
        textView.setText(tempTime);
    }

    @Override
    public void sendButton(Object button) {
        this.textView = (TextView) button;
    }
}
