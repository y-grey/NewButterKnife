package com.example.butterknife;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.widget.Toast.LENGTH_SHORT;

public abstract class BaseFragment extends Fragment {
    protected BaseActivity activity;

    protected static int num;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        activity = (BaseActivity) getActivity();
        View rootView = ButterKnife.bind(this,inflater,container);
        num++;
        init();
        return rootView;
    }
    protected abstract void init();
}
