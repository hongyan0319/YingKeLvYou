package com.example.administrator.yingkelvyou.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.yingkelvyou.R;
import com.example.administrator.yingkelvyou.base.BaseActivity;
import com.example.administrator.yingkelvyou.main.Custom.CustomFragment;
import com.example.administrator.yingkelvyou.main.Destination.DestinationFragment;
import com.example.administrator.yingkelvyou.main.Mine.MineFragment;
import com.example.administrator.yingkelvyou.main.home.HomeFragment;

public class MainActivity extends BaseActivity implements MainContract.View,View.OnClickListener{
    private HomeFragment homeFragment;
    private DestinationFragment destinationFragment;
    private CustomFragment customFragment;
    private MineFragment mineFragment;


    @Override
    protected void initData() {
        homeFragment=new HomeFragment().newInstance();
        destinationFragment=new DestinationFragment().newInstance();
        customFragment=new CustomFragment().newInstance();
        mineFragment=new MineFragment().newInstance();
    }

    @Override
    protected void initView() {
        View home=findViewById(R.id.layout_home);
        home.setOnClickListener(this);
        View destination=findViewById(R.id.layout_destination);
        destination.setOnClickListener(this);
        View custom=findViewById(R.id.layout_custom);
        custom.setOnClickListener(this);
        View mine=findViewById(R.id.layout_mine);
        mine.setOnClickListener(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (view.getId()){
            case R.id.layout_home:
                transaction.replace(R.id.frame_container,homeFragment);
            break;
            case R.id.layout_destination:
                transaction.replace(R.id.frame_container,destinationFragment);
                break;
            case R.id.layout_custom:
                transaction.replace(R.id.frame_container,customFragment);
                break;
            case R.id.layout_mine:
                transaction.replace(R.id.frame_container,mineFragment);
                break;
        }
        transaction.commit();
    }
}
