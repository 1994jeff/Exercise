package com.grandstream.jfdeng.exercise.presenter;

import android.content.Context;

import com.grandstream.jfdeng.exercise.model.BreathModel;
import com.grandstream.jfdeng.exercise.model.Impl.BreathModelImpl;
import com.grandstream.jfdeng.exercise.ui.activity.MainActivity;
import com.grandstream.jfdeng.exercise.ui.base.BaseActivity;
import com.grandstream.jfdeng.exercise.ui.base.BasePresenter;
import com.grandstream.jfdeng.exercise.view.BreathView;

/**
 * Created by yf on 18-5-3.
 */

public class BreathPresenter extends BasePresenter{

    BreathModel breathModel;
    BreathView breathView;
    Context context;

    public BreathPresenter(BreathView breathView,Context context) {
        this.breathView = breathView;
        this.context = context;
        breathModel = new BreathModelImpl(context);
    }

    public void startPlay(int i) {
        breathModel.startPlay(i);
        breathView.showStatus();
    }

    public void endPlay() {
        breathModel.endPlay();
        breathView.endPlay();
    }
}
