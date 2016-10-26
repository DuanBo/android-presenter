package com.liangmayong.android_presenter;

import com.liangmayong.presenter.Presenter;

/**
 * Created by LiangMaYong on 2016/10/26.
 */

public class BasePresenter extends Presenter<BasePresenter.IView> {

    public static interface IView {
        void toast(String s);
    }

    public void exec() {
        response("sssssssssssss").map(new OnMap<String, Integer>() {
            @Override
            public Integer map(String data) {
                return data.length();
            }
        }).back(new OnCallback<Integer>() {
            @Override
            public void callback(IView view, Integer data) {
                view.toast(data + "");
            }
        }).map(new OnMap<Integer, String>() {
            @Override
            public String map(Integer data) {
                return data+"";
            }
        }).back(new OnCallback<String>() {
            @Override
            public void callback(IView view, String data) {
                view.toast(data);
            }
        });
    }
}
