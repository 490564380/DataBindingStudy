package com.example.zhanghua.databindingstudy.sample.custombinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.zhanghua.databindingstudy.ContractBinding;
import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.model.Contact;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;

public class CustomBindingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContractBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_binding);
//        to use ContractBinding need rebuild project
        Contact contact = new Contact("324231", "Japan");
        binding.setContact(contact);
    }
}
