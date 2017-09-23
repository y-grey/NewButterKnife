package com.example.butterknife;


import android.widget.TextView;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;

@BindLayout(R.layout.simple_activity)
public class SimpleFragment extends BaseFragment {
    @BindView(R.id.title)TextView title;
    @OnClick(R.id.hello)void click(){
        activity.addFragment(new SimpleFragment());
    }
    @Override
    protected void init() {
        title.setText("SimpleFragment");
    }
}
