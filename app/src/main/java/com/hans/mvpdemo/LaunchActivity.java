package com.hans.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Hans
 * @create 2019/3/19 16:54
 * @description 入口页面
 */
public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }


    public void turnToPage(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
