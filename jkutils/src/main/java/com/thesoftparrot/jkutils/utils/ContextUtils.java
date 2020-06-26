package com.thesoftparrot.jkutils.utils;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ContextUtils {
    private ContextUtils(){}

    public static void toast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    public static void setUpToolbar(AppCompatActivity activity, Toolbar toolbar, String title, boolean goBack){
        activity.setSupportActionBar(toolbar);

        if(activity.getSupportActionBar() != null){
            activity.getSupportActionBar().setTitle(title);

            if(goBack){
                activity.getSupportActionBar().setHomeButtonEnabled(true);
                activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

        }

    }

}
