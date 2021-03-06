package com.grandstream.jfdeng.exercise.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.grandstream.jfdeng.exercise.R;
import com.grandstream.jfdeng.exercise.ui.base.BaseActivity;
import com.grandstream.jfdeng.exercise.ui.common.MenuView;
import com.grandstream.jfdeng.exercise.ui.fragment.ExecriseFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    MenuView mMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuView = (MenuView) findViewById(R.id.menuView);
        mMenuView.setMyListener(this);
        switchFragment(R.id.fragment_container,new ExecriseFragment(),false);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.item1:
                break;
            case R.id.item2:
                break;
            case R.id.item3:
                break;
            case R.id.item4:
                break;
        }
    }

}
