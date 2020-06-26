package com.thesoftparrot.jkutils.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@SuppressLint("SimpleDateFormat")
public class SystemUtils {

    private SystemUtils(){}

    public static String getCurrentSystemTime(boolean isOf24Hour){
        String format = "HH:mm:ss"; // 24 hour format

        if(!isOf24Hour)
            format = "HH:mm:ss a"; // 12 hour format

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(calendar.getTime());
    }

    public static String getCurrentSystemDate(){
        String format = "yyyy / MM / dd";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(calendar.getTime());
    }

    public static boolean isConnectedToNetwork(Context context){
        boolean hasWifi = false;
        boolean hasMobileData = false;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(cm != null){
            NetworkInfo[] networkInfos = cm.getAllNetworkInfo();

            for (NetworkInfo network : networkInfos){
                if(network != null){
                    if(network.getTypeName().equalsIgnoreCase("WIFI")){
                        if(network.isConnected())
                            hasWifi = true;
                    }
                    else if(network.getTypeName().equalsIgnoreCase("MOBILE")){
                        if(network.isConnected())
                            hasMobileData = true;
                    }
                }
            }

        }

        return hasWifi || hasMobileData;
    }

}
