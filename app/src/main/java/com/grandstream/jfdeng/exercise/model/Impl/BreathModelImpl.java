package com.grandstream.jfdeng.exercise.model.Impl;

import android.content.Context;

import com.grandstream.jfdeng.exercise.model.BreathModel;
import com.grandstream.jfdeng.exercise.utils.BreathThread;

/**
 * Created by yf on 18-5-3.
 */

public class BreathModelImpl implements BreathModel {

    BreathThread playRunnable;
    Context context;
    Thread play;
    int type;

    public void setType(int type) {
        this.type = type;
        if (type == 0) {
            playRunnable = new BreathThread(4000, 30, context);
        } else if (type == 1) {
            playRunnable = new BreathThread(6000, 30, context);
        } else {
            playRunnable = new BreathThread(9000, 30, context);
        }
    }

    public BreathModelImpl(Context context) {
        this.context = context;
    }


    @Override
    public void startPlay(int i) {
        setType(i);
        play = new Thread(playRunnable);
        play.start();
    }

    @Override
    public void endPlay() {
//        playRunnable.stop();
        play.interrupt();
    }
}
