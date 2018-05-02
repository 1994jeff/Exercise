package com.grandstream.jfdeng.exercise.ui.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.grandstream.jfdeng.exercise.R;

/**
 * Created by yf on 18-4-28.
 */

public class BaseActivity extends FragmentActivity {

    public void switchFragment(int container,BaseFragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        if(fragment.isAdded()){
//            fragmentTransaction.show(fragment);
//        }else {
//            fragmentTransaction.add(fragment,fragment.getClass().getName());
//        }
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
