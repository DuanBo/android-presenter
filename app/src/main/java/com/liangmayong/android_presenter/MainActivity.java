package com.liangmayong.android_presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liangmayong.presenter.BindP;
import com.liangmayong.presenter.PresenterBind;
import com.liangmayong.presenter.PresenterHolder;

@BindP(BasePresenter.class)
public class MainActivity extends AppCompatActivity implements BasePresenter.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PresenterHolder holder = PresenterBind.bind(this);
        holder.getPresenter(BasePresenter.class).exec();
    }

    @Override
    public void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
