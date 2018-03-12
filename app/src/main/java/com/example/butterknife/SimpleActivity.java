package com.example.butterknife;

import android.widget.TextView;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;

@BindLayout(R.layout.simple_activity)
public class SimpleActivity extends BaseActivity {
    @BindView(value = R.id.text ,parentId = R.id.commonlayout1)
    TextView text1;
    @BindView(value = R.id.text ,parentId = R.id.commonlayout2)
    TextView text2;
    @OnClick(R.id.btn) void click() {
        addFragment(new SimpleFragment());
    }
    @Override
    protected void init() {
        btn.setText("SimpleActivity\nadd Fragment");
        text1.setText("I am text1 in commonlayout1");
        text2.setText("I am text2 in commonlayout2");
    }
}
