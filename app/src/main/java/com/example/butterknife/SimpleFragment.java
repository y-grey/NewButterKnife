package com.example.butterknife;


import android.widget.Button;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;

@BindLayout(R.layout.simple_activity)
public class SimpleFragment extends BaseFragment {
    @BindView(R.id.btn)Button btn;
    @OnClick(R.id.btn) void click() {
        activity.addFragment(new SimpleFragment());
    }

    @Override
    protected void init() {
        btn.setText("SimpleFragment\nadd Fragment "+num);
    }
}
