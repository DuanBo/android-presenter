package com.liangmayong.presenter;

import android.os.Handler;

/**
 * Created by LiangMaYong on 2016/9/17.
 */
public class Presenter<V> {
    //view
    private V view;
    //isAttached
    private boolean isAttached = false;
    //handler
    private Handler handler = new Handler();

    /**
     * getViewInstance
     *
     * @return view
     */
    protected final V getViewInstance() {
        return view;
    }

    /**
     * isAttached
     *
     * @return isAttached
     */
    public final boolean isAttached() {
        return isAttached;
    }

    /**
     * attach
     *
     * @param view view
     */
    public void onAttach(V view) {
        this.view = view;
        isAttached = true;
    }

    /**
     * dettach
     */
    public void onDettach() {
        isAttached = false;
        view = null;
    }

    /**
     * postDelayed
     *
     * @param runnable    runnable
     * @param delayMillis delayMillis
     */
    public void postDelayed(Runnable runnable, long delayMillis) {
        handler.postDelayed(runnable, delayMillis);
    }
}
