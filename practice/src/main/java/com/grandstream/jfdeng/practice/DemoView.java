package com.grandstream.jfdeng.practice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yf on 18-4-28.
 */

public class DemoView extends LinearLayout{

    TextView mTextView;
    ImageView mImageView;

    public DemoView(Context context) {
        super(context);
    }

    public DemoView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.item_demo,this,true);
        mImageView = findViewById(R.id.img);
        mTextView = findViewById(R.id.text);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.demo);
        String textName = array.getString(R.styleable.demo_textName);
        Drawable drawable = array.getDrawable(R.styleable.demo_imgSrc);
        mImageView.setImageDrawable(drawable);
        mTextView.setText(textName);

    }

    public DemoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
