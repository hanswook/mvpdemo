package com.hans.mvpdemo.presenter;


import com.hans.mvpdemo.base.BasePresenter;
import com.hans.mvpdemo.contract.NewsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public class NewsPresenter extends BasePresenter<NewsContract.IView> implements NewsContract.Presenter {


    @Override
    protected void init() {

    }


    @Override
    public void getNews() {
        if (isAttach()) {
            List<String> news = mockNews();
            getView().showNews(news);
        }
    }

    private List<String> mockNews() {
        List<String> result = new ArrayList<>();
        result.add("新闻1");
        result.add("新闻2");
        result.add("新闻3");
        result.add("新闻4");
        result.add("新闻5");
        result.add("新闻6");
        result.add("新闻7");
        return result;
    }

}
