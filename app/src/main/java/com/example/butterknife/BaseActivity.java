package com.example.butterknife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by _yph on 2017/5/2 0002.
 */

public abstract class BaseActivity extends FragmentActivity {
    @BindView(R.id.btn) TextView btn;//如果多个子Activity有此控件，可放在BaseActivity统一初始化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        init();
    }
    protected abstract void init();

    public void addFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.add(android.R.id.content, fragment);
        ft.commitAllowingStateLoss();
    }
}
