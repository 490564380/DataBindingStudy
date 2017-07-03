package com.example.zhanghua.databindingstudy.sample.dynamic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityDynamicBinding;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;

public class DynamicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDynamicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dynamic);
        binding.recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        binding.recyclerView.setAdapter(new UserAdapter());
    }
}
