package com.example.zhanghua.databindingstudy.sample.viewstub;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityViewStubBinding;
import com.example.zhanghua.databindingstudy.databinding.ViewStubBinding;
import com.example.zhanghua.databindingstudy.model.User;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;

public class ViewStubActivity extends BaseActivity {

    private ActivityViewStubBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);

        mBinding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewStubBinding binding = DataBindingUtil.bind(inflated);
                binding.setUser(new User("Albet", "Einstein"));
            }
        });
    }

    public void inflateViewStub(View view) {
        if (!mBinding.viewStub.isInflated()) {
            mBinding.viewStub.getViewStub().inflate();
        }
    }
}
