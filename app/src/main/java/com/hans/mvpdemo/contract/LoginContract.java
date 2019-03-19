package com.hans.mvpdemo.contract;

import com.hans.mvpdemo.base.IBasePresenter;
import com.hans.mvpdemo.base.IBaseView;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public interface LoginContract {

    interface IView extends IBaseView {

        /**
         * 显示用户名称
         *
         * @param name 姓名
         */
        void showName(String name);
    }


    interface Presenter extends IBasePresenter<IView> {

        /**
         * 模拟获取用户名称
         */
        void getName();
    }


}
