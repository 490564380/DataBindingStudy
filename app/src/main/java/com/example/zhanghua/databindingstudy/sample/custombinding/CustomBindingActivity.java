package com.example.zhanghua.databindingstudy.sample.custombinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhanghua.databindingstudy.ContractBinding;
import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.model.Contact;

public class CustomBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContractBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_binding);
//        to use ContractBinding need rebuild project
        Contact contact = new Contact("324231", "Japan");
        binding.setContact(contact);
    }
}
