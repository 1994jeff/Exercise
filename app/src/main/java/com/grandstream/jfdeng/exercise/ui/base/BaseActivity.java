package com.grandstream.jfdeng.exercise.ui.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.grandstream.jfdeng.exercise.R;
import com.grandstream.jfdeng.exercise.ui.fragment.BreathFragment;

/**
 * Created by yf on 18-4-28.
 */

public abstract class BaseActivity extends FragmentActivity {

    public void switchFragment(int container, BaseFragment fragment, boolean addToStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        if (addToStack) fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        BaseFragment fragment = (BaseFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        fragment.onBackPress();
        super.onBackPressed();
    }
}
