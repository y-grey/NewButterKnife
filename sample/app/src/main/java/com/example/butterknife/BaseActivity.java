package com.example.butterknife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import butterknife.ButterKnife;

/**
 * Created by _yph on 2017/5/2 0002.
 */

public abstract class BaseActivity extends FragmentActivity {
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
        ft.add(R.id.slide_fragment, fragment);
        ft.commitAllowingStateLoss();
    }
}
