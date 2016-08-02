package com.example.administrator.yingkelvyou.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/8/2.
 */
public abstract class BaseFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView=inflater.inflate(getLayoutId(),null);
        initView();

        initData();
        return fragmentView;
    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract int getLayoutId() ;


}
