package com.grandstream.jfdeng.exercise.ui.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.grandstream.jfdeng.exercise.R;
import com.grandstream.jfdeng.exercise.model.BreathModel;
import com.grandstream.jfdeng.exercise.presenter.BreathPresenter;
import com.grandstream.jfdeng.exercise.ui.activity.MainActivity;
import com.grandstream.jfdeng.exercise.ui.base.BaseFragment;
import com.grandstream.jfdeng.exercise.view.BreathView;

public class BreathFragment extends BaseFragment<BreathPresenter> implements BreathView{

    Button btnEnd,btnNor,btnStro,btnSup;
    TextView mTextView;

    @Override
    public BreathPresenter getPresenter() {
        return new BreathPresenter(BreathFragment.this,getContext());
    }

    @Override
    protected void initView(View view) {
        mTextView = view.findViewById(R.id.textView);
        btnNor = view.findViewById(R.id.buttonNormal);
        btnStro = view.findViewById(R.id.buttonStro);
        btnSup = view.findViewById(R.id.buttonSuper);
        btnEnd = view.findViewById(R.id.buttonEnd);
        btnNor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.startPlay(0);
            }
        });
        btnStro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.startPlay(1);
            }
        });
        btnSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.startPlay(2);
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.endPlay();
            }
        });
    }

    @Override
    public int getFragmentResource() {
        return R.layout.fragment_breath;
    }

    @Override
    public void onBackPress() {
        presenter.endPlay();
    }


    @Override
    public void showStatus() {
        mTextView.setText(getString(R.string.start_exercise));
    }

    @Override
    public void endPlay() {
        mTextView.setText(getString(R.string.end_exercise));
    }

}
