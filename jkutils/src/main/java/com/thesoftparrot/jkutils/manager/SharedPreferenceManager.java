package com.thesoftparrot.jkutils.manager;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceManager {

    private static SharedPreferenceManager instance;

    public static SharedPreferenceManager getInstance(Context context, String key) {
        if(instance == null)
            instance = new SharedPreferenceManager(context, key);
        return instance;
    }

    private SharedPreferences mSharedPref;

    private SharedPreferenceManager(Context context, String key) {
        mSharedPref = context.getSharedPreferences(key, Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String retrieveString(String key){
        return mSharedPref.getString(key, null);
    }

    public void storeBoolean(String key, boolean value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public Boolean retrieveBoolean(String key){
        return mSharedPref.getBoolean(key, false);
    }

    public void storeInteger(String key, int value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public int retrieveInteger(String key){
        return mSharedPref.getInt(key, -1);
    }

}
