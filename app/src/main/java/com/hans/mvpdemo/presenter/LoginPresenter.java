package com.hans.mvpdemo.presenter;


import com.hans.mvpdemo.base.BasePresenter;
import com.hans.mvpdemo.contract.LoginContract;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public class LoginPresenter extends BasePresenter<LoginContract.IView> implements LoginContract.Presenter {


    /**
     * 做一些初始化操作。
     * 例如: 将数据接口层以及处理层封装到一起。统一放到这个获取实例。
     */
    @Override
    protected void init() {

    }


    @Override
    public void getName() {
        if (isAttach()) {
            getView().showName("小刚");
        }
    }
}
