package com.hans.mvpdemo.base;

import android.content.Context;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    public WeakReference<V> mViewRef;
    protected Reference<Context> mContextRef;

    @Override
    public void onAttach(V pView, Context context) {
        mViewRef = new WeakReference<V>(pView);
        this.mContextRef = new WeakReference<>(context);
        init();
    }

    /**
     * 做一些初始化操作
     */
    protected abstract void init();


    public V getView() {
        if (isAttach()) {
            return mViewRef.get();
        } else {
            return null;
        }
    }

    public boolean isAttach() {
        return null != mViewRef && null != mViewRef.get();
    }

    /**
     * 获取Context
     *
     * @return
     */
    protected Context getContext() {
        return mContextRef.get();
    }

    /**
     * 判断是否与View建立了关联
     *
     * @return
     */
    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @Override
    public void onDettach() {
        if (null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
        if (mContextRef != null) {
            mContextRef.clear();
            mContextRef = null;
        }
    }
}
