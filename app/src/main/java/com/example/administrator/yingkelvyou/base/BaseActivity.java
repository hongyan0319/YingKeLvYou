package com.example.administrator.yingkelvyou.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/8/1.
 */
public abstract class BaseActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initData();
        initView();

    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract int getLayoutId();
}
