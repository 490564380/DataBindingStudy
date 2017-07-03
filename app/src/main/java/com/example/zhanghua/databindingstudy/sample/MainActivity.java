package com.example.zhanghua.databindingstudy.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.sample.basic.BasicActivity;
import com.example.zhanghua.databindingstudy.sample.collection.CollectionActivity;
import com.example.zhanghua.databindingstudy.sample.custombinding.CustomBindingActivity;
import com.example.zhanghua.databindingstudy.sample.include.IncludeActivity;
import com.example.zhanghua.databindingstudy.sample.observable.ObservableActivity;
import com.example.zhanghua.databindingstudy.sample.resource.ResourceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBasic(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }

    public void openCustomBinding(View view) {
        startActivity(new Intent(this, CustomBindingActivity.class));
    }

    public void openIncludes(View view) {
        startActivity(new Intent(this, IncludeActivity.class));
    }

    public void openCollections(View view) {
        startActivity(new Intent(this, CollectionActivity.class));
    }

    public void openResources(View view) {
        startActivity(new Intent(this, ResourceActivity.class));
    }

    public void openObservable(View view) {
        startActivity(new Intent(this, ObservableActivity.class));
    }






}
