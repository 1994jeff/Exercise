package com.grandstream.jfdeng.exercise.utils;

import android.content.Context;
import android.media.SoundPool;
import android.os.Handler;
import android.util.Log;

/**
 * Created by yf on 18-5-3.
 */

public class BreathThread implements Runnable {

    private int count;
    private int timeinterval;
    boolean isRunning = false;

    private Context mContext;
    private SoundPool sp;
    boolean isFirstIn =false;

    public BreathThread(int timeinterval, int count, Context mContext) {
        this.timeinterval = timeinterval;
        this.count = count;
        this.mContext = mContext;
        isRunning = true;
        sp = SoundPoolUtils.getInstance(mContext);
    }

    @Override
    public void run() {
        while (isRunning && count > 0) {
            try {
                if(!isFirstIn){
                    Thread.sleep(1000);
                    isFirstIn = true;
                }
                SoundPoolUtils.playMusic(sp, 1, mContext);
                Thread.sleep(this.timeinterval);
                SoundPoolUtils.playMusic(sp, 2, mContext);
                Thread.sleep(this.timeinterval);
                count--;
                Log.i("jeff", count + " count");
            } catch (InterruptedException e) {
                break;
            }
        }
        Log.i("jeff", count + " ,,count");
        if(count==0){
            SoundPoolUtils.playMusic(sp, 3, mContext);
        }else{

        }
    }

    public void stop() {
        isRunning = false;
    }
}
