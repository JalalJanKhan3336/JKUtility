package com.thesoftparrot.jkutils.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.thesoftparrot.jkutils.model.Parcel;

import java.io.Serializable;

public class MoverUtils {
    private MoverUtils(){}

    public static void moveTo(Context fromContext, Class toClass){
        Intent intent = new Intent(fromContext, toClass);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toClass, String key, String data){
        Intent intent = new Intent(fromContext, toClass);
        intent.putExtra(key, data);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toClass, String key, Bundle data){
        Intent intent = new Intent(fromContext, toClass);
        intent.putExtra(key, data);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toClass, String key, Serializable data){
        Intent intent = new Intent(fromContext, toClass);
        intent.putExtra(key, data);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toClass, String key, Parcelable data){
        Intent intent = new Intent(fromContext, toClass);
        intent.putExtra(key, data);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toClass, String key, Parcel data){
        Intent intent = new Intent(fromContext, toClass);
        intent.putExtra(key, data);

        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

}
