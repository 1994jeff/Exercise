package com.grandstream.jfdeng.exercise.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandstream.jfdeng.exercise.R;

/**
 * Created by yf on 18-4-28.
 */

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(getFragmentResource(),container,false);
        initView(view);
        return view;
    }

    protected abstract void initView(View view);

    public abstract int getFragmentResource();
}
