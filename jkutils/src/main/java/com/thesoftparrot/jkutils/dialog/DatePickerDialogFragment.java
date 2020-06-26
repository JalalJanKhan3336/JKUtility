package com.thesoftparrot.jkutils.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Objects;

public class DatePickerDialogFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    private DateSelectedListener mDateSelectedListener;

    public void setDateSelectedListener(DateSelectedListener mDateSelectedListener) {
        this.mDateSelectedListener = mDateSelectedListener;
    }

    public DatePickerDialogFragment() {}

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(Objects.requireNonNull(getContext()), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        String formattedDate = DateFormat.getDateInstance().format(calendar.getTime());

        if(mDateSelectedListener != null)
            mDateSelectedListener.onDateSelected(formattedDate, year, month, day);
    }

    // Interface
    public interface DateSelectedListener {
        void onDateSelected(String selectedDate, int year, int month, int day);
    }

}
