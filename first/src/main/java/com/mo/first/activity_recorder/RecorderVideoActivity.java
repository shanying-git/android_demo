package com.mo.first.activity_recorder;

import android.os.Bundle;
import com.mo.first.R;
import com.mo.first.base.BaseActivity;

/**
 * Created by mo on 2016/2/19.
 * 录制视频
 */
public class RecorderVideoActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_recorder);
        setTitle("录制视频");
    }
}
