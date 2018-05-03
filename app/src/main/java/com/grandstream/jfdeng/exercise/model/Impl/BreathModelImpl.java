package com.grandstream.jfdeng.exercise.model.Impl;

import android.content.Context;

import com.grandstream.jfdeng.exercise.model.BreathModel;
import com.grandstream.jfdeng.exercise.presenter.BreathPresenter;
import com.grandstream.jfdeng.exercise.utils.BreathThread;

/**
 * Created by yf on 18-5-3.
 */

public class BreathModelImpl implements BreathModel {

    BreathThread playRunnable;
    Context context;
    Thread play;
    BreathPresenter presenter;
    boolean isRunning = false;
    final int num = 30;

    public BreathModelImpl(Context context, BreathPresenter presenter, int i) {
        this.context = context;
        this.presenter = presenter;
        playRunnable = new BreathThread(4000, num, context);
        play = new Thread(playRunnable);
    }

    @Override
    public void startPlay(int i) {
        if(isRunning){
            play.interrupt();
            init(i);
            presenter.showStatus(i);
            play = new Thread(playRunnable);
        }
        play.start();
        isRunning = true;
    }

    private void init(int type) {
        if (type == 0) {
            playRunnable = new BreathThread(4000, num, context);
        } else if (type == 1) {
            playRunnable = new BreathThread(6000, num, context);
        } else {
            playRunnable = new BreathThread(9000, num, context);
        }
    }

    @Override
    public void endPlay() {
//        playRunnable.stop();
        play.interrupt();
    }
}
