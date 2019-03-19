package com.hans.mvpdemo;

import android.view.View;
import android.widget.Toast;

import com.hans.mvpdemo.base.BaseActivity;
import com.hans.mvpdemo.contract.LoginContract;
import com.hans.mvpdemo.contract.NewsContract;
import com.hans.mvpdemo.presenter.LoginPresenter;
import com.hans.mvpdemo.presenter.NewsPresenter;

import java.util.List;

/**
 * @author Hans
 * @create 2019/3/19 16:32
 * @description 测试页面
 */
public class MainActivity extends BaseActivity implements LoginContract.IView, NewsContract.IView {

    private LoginContract.Presenter loginPresenter;
    private NewsContract.Presenter newsPresenter;

    @Override
    protected void addPresenters() {
        loginPresenter = new LoginPresenter();
        newsPresenter = new NewsPresenter();
        addToPresenters(loginPresenter);
        addToPresenters(newsPresenter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    public void testLogin(View view) {
        loginPresenter.getName();
    }

    public void testNews(View view) {
        newsPresenter.getNews();
    }


    @Override
    public void showName(String name) {
        Toast.makeText(mActivity, "name:" + name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showNews(List<String> news) {
        Toast.makeText(mActivity, "news一共有" + news.size() + "条消息", Toast.LENGTH_SHORT).show();

    }
}
