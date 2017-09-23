package com.example.butterknife;

import android.widget.TextView;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;


@BindLayout(R.layout.simple_activity)
public class SimpleActivity extends BaseActivity {
    @BindView(R.id.title) TextView title;
    @BindView(value = R.id.text ,parentId = R.id.commonlayout1) TextView text1;
    @BindView(value = R.id.text ,parentId = R.id.commonlayout2) TextView text2;
    @OnClick(R.id.hello)void onclick(){
        addFragment(new SimpleFragment());
    }

    @Override
    protected void init() {
        title.setText("SimpleActivity");
        text1.setText("commonlayout1");
        text2.setText("commonlayout2");
    }
}
