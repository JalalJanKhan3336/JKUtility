package com.thesoftparrot.jkutils.utils;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

import java.util.UUID;

public class FieldUtils {
    private FieldUtils(){}

    public static void isFieldEmpty(EditText... fields){
        for(EditText field : fields){
            String value = field.getText().toString().trim();

            if(TextUtils.isEmpty(value)){
                field.setError("This field is required!");
                break;
            }

        }
    }

    public static void clearFields(EditText... fields){
        for(EditText field : fields){
            field.setText("");
        }
    }

    public static String generateUID(){
        return UUID.randomUUID().toString();
    }

    public static boolean isEmail(String email){
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
