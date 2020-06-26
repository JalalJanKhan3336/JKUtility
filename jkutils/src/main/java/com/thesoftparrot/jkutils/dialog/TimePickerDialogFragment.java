package com.thesoftparrot.jkutils.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerDialogFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    private TimePickerDialogListener mTimePickerDialogListener;

    public void setTimePickerDialogListener(TimePickerDialogListener mTimePickerDialogListener) {
        this.mTimePickerDialogListener = mTimePickerDialogListener;
    }

    public TimePickerDialogFragment() {}

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(getContext(), this, hour, minute, false);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {

        if(mTimePickerDialogListener != null)
            mTimePickerDialogListener.onTimeSelected(timePicker, hourOfDay, minute);
    }

    // Interface
    public interface TimePickerDialogListener {
        void onTimeSelected(TimePicker timePicker, int hour, int minute);
    }

}
