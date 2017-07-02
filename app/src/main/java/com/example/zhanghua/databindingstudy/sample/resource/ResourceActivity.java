package com.example.zhanghua.databindingstudy.sample.resource;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ResourceBinding;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ResourceBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_resource);

        binding.setLarge(true);

        binding.setFirstName("liang");
        binding.setLastName("fei");

        binding.setBananaCount(2);
        binding.setOrangeCount(10);
    }

}
