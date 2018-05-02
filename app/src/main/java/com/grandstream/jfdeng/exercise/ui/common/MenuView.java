package com.grandstream.jfdeng.exercise.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.grandstream.jfdeng.exercise.R;

/**
 * Created by yf on 18-4-28.
 */

public class MenuView extends LinearLayout {

    ItemView mItemView1,mItemView2,mItemView3,mItemView4;

    public MenuView(Context context) {
        super(context);
    }

    public MenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public void setMyListener(OnClickListener listener) {
        initListener(listener);
    }

    private void initListener(OnClickListener listener) {
        mItemView1.setOnClickListener(listener);
        mItemView2.setOnClickListener(listener);
        mItemView3.setOnClickListener(listener);
        mItemView4.setOnClickListener(listener);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.menu_view,this,true);
        mItemView1 = findViewById(R.id.item1);
        mItemView2 = findViewById(R.id.item2);
        mItemView3 = findViewById(R.id.item3);
        mItemView4 = findViewById(R.id.item4);
    }

    public MenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
