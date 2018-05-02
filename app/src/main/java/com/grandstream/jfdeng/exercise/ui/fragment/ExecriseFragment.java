package com.grandstream.jfdeng.exercise.ui.fragment;

import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.grandstream.jfdeng.exercise.R;
import com.grandstream.jfdeng.exercise.ui.activity.MainActivity;
import com.grandstream.jfdeng.exercise.ui.base.BaseActivity;
import com.grandstream.jfdeng.exercise.ui.base.BaseFragment;

/**
 * Created by yf on 18-4-28.
 */

public class ExecriseFragment extends BaseFragment {

    Button btn;

    @Override
    protected void initView(View view) {
        btn = view.findViewById(R.id.start);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((BaseActivity)getActivity()).switchFragment(R.id.fragment_container,new BreathFragment());
            }
        });
    }

    @Override
    public int getFragmentResource() {
        return R.layout.fragment_execrise;
    }

}
