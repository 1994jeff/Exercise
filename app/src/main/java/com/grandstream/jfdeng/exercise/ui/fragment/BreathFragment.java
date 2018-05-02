package com.grandstream.jfdeng.exercise.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grandstream.jfdeng.exercise.R;
import com.grandstream.jfdeng.exercise.ui.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BreathFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BreathFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BreathFragment extends BaseFragment {

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getFragmentResource() {
        return R.layout.fragment_breath;
    }
}
