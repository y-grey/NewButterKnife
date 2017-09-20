package com.example.butterknife;

import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;


@BindLayout(R.layout.simple_activity)
public class SimpleActivity extends BaseActivity {
    @BindView(R.id.title) TextView title;
    @BindView(value = R.id.text ,parentId = R.id.commonlayout1) TextView text1;
    @OnClick(R.id.hello)void onclick(){
        Toast.makeText(this,"点击了 ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void init() {
        text1.setText("commonlayout1");
    }
}
