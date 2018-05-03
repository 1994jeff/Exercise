package com.grandstream.jfdeng.exercise.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grandstream.jfdeng.exercise.R;

/**
 * Created by yf on 18-5-3.
 */

public class HeadView extends LinearLayout {

    ImageView left,right;
    TextView headTitle;

    public HeadView(Context context) {
        super(context);
    }

    public HeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(getLayoutResource(),this,true);
        left = findViewById(R.id.leftImg);
        right = findViewById(R.id.rightImg);
        headTitle = findViewById(R.id.headTitle);
    }

    public HeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getLayoutResource() {
        return R.layout.head_view;
    }
}
