package com.hans.mvpdemo.base;

import android.content.Context;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public interface IBasePresenter<V extends IBaseView> {

    /**
     * 绑定view到presenter
     *
     * @param pView
     * @param context
     */
    void onAttach(V pView, Context context);

    /**
     * 解绑view
     */
    void onDettach();

}
