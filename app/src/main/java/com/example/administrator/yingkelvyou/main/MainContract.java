package com.example.administrator.yingkelvyou.main;

import com.example.administrator.yingkelvyou.base.IBaseModel;
import com.example.administrator.yingkelvyou.base.IBasePresenter;
import com.example.administrator.yingkelvyou.base.IBaseView;

/**
 * Created by Administrator on 2016/8/1.
 */
public class MainContract {
    public interface View extends IBaseView{
        void onSuccess(String content);

        void onFail(String msg);
    }

    public interface  Presenter extends IBasePresenter{
        void getData();

    }

    public interface  Model extends IBaseModel{
        void getData();
    }
}
