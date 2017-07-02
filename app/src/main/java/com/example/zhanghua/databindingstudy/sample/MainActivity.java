package com.example.zhanghua.databindingstudy.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.sample.basic.BasicActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBasic(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }


}
