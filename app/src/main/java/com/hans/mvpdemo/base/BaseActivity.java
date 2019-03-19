package com.hans.mvpdemo.base;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView {
    protected List<IBasePresenter> mPresenters;
    protected AppCompatActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mPresenters = new ArrayList<>();
        mActivity = this;
        addPresenters();
        for (IBasePresenter presenter : mPresenters) {
            presenter.onAttach(this, mActivity);
        }
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (IBasePresenter presenter : mPresenters) {
            presenter.onDettach();
        }
    }

    protected abstract void addPresenters();

    protected abstract int getLayoutId();

    protected abstract void init();

    protected void addToPresenters(IBasePresenter child) {
        mPresenters.add(child);
    }

}
