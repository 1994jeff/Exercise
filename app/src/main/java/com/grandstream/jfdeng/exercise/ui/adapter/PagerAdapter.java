package com.grandstream.jfdeng.exercise.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yf on 18-5-2.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    FragmentManager fm;
    List<Fragment> list;

    public PagerAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.fm = fm;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list==null?null:list.get(position);
    }

    @Override
    public int getCount() {
        return list.size()>0?list.size():0;
    }
}
