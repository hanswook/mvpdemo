package com.hans.mvpdemo.contract;

import com.hans.mvpdemo.base.IBasePresenter;
import com.hans.mvpdemo.base.IBaseView;

import java.util.List;

/**
 * @author Hans
 * @create 2019/3/19
 * @description
 */
public interface NewsContract {

    interface IView extends IBaseView {

        /**
         * 显示获取到的新闻
         *
         * @param news
         */
        void showNews(List<String> news);
    }


    interface Presenter extends IBasePresenter<IView> {

        /**
         * 模拟获取新闻
         */
        void getNews();
    }


}
