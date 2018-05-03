package com.grandstream.jfdeng.exercise.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.grandstream.jfdeng.exercise.R;

import java.util.HashMap;

/**
 * Created by yf on 18-5-3.
 */

public class SoundPoolUtils {

    private static HashMap<Integer, Integer> map;
    private static boolean isLoaded = false;

    private SoundPoolUtils() {
    }

    private static class SoundPoolInstance {
        private static SoundPool spPool;

        @SuppressWarnings("deprecation")
        private SoundPool newInstance(Context context) {
            if (spPool == null) {
                spPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
                map = new HashMap<>();
                map.put(1, spPool.load(context, R.raw.shousuo, 1));
                map.put(2, spPool.load(context, R.raw.fangsong, 1));
                map.put(3, spPool.load(context, R.raw.comon, 1));
                spPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                        isLoaded = true;
                    }
                });
            }
            return spPool;
        }
    }

    public static SoundPool getInstance(Context context) {
        return new SoundPoolInstance().newInstance(context);
    }

    public static void playMusic(SoundPool sp, int number,Context context) {
        if (isLoaded) {
            AudioManager am = (AudioManager) context
                    .getSystemService(Context.AUDIO_SERVICE);
            float audioMaxVolumn = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            float volumnCurrent = am.getStreamVolume(AudioManager.STREAM_MUSIC);
            float volumnRatio = volumnCurrent / audioMaxVolumn;
            sp.play(map.get(number),
                    volumnRatio,
                    volumnRatio,
                    1, //play level
                    0,// loop nums
                    1);// speed when loop
        }
    }

}
