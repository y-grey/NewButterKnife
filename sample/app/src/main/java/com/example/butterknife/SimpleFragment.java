package com.example.butterknife;


import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.OnClick;

@BindLayout(R.layout.simple_activity)
public class SimpleFragment extends BaseFragment {
    @BindView(R.id.title)TextView title;
    @OnClick(R.id.hello)void click(){
        Toast.makeText(getActivity(),"点击了 SimpleFragment",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void init() {
        title.setText("this is a fragment");
    }
}
