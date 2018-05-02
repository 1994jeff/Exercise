package com.grandstream.jfdeng.exercise.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grandstream.jfdeng.exercise.R;

/**
 * Created by yf on 18-4-28.
 */

public class ItemView extends LinearLayout {

    ImageView mImageView;
    TextView mTextView;

    public ItemView(Context context) {
        super(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(getLayoutResource(),this,true);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.menu_styleable);
        Drawable drawable = typedArray.getDrawable(R.styleable.menu_styleable_imgSrc);
        String text = typedArray.getString(R.styleable.menu_styleable_textStr);
        mImageView = findViewById(R.id.imageView);
        mTextView = findViewById(R.id.textView);
        mImageView.setImageDrawable(drawable);
        mTextView.setText(text);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context,attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public int getLayoutResource() {
        return R.layout.item_menu;
    }

    public void setTextViewText(String text){
        mTextView.setText(text);
    }

    public void setImageViewDrawable(Drawable drawable){
        mImageView.setImageDrawable(drawable);
    }
}
