package com.example.zhanghua.databindingstudy.sample.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityBasicBinding;
import com.example.zhanghua.databindingstudy.model.User;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("Albet", "Einstein", 28);
        binding.setUser(user);
    }




}
