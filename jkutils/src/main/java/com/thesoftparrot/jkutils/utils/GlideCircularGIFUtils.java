package com.thesoftparrot.jkutils.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class GlideCircularGIFUtils {

    private GlideCircularGIFUtils(){}

    public static void loadImage(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Activity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(View context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Load image via Uri
    public static void loadImage(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Activity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(View context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Load image via Drawable
    public static void loadImage(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Activity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(View context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Load image via resId
    public static void loadImage(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Activity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(View context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Load image via Bitmap
    public static void loadImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Activity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(View context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

}
