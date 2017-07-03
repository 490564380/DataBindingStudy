package com.example.zhanghua.databindingstudy.sample.viewWithIds;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityViewWithIdsBinding;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;

public class ViewWithIDsActivity extends BaseActivity {

    private ActivityViewWithIdsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_with_ids);
    }

    public void showMyName(View view) {
        binding.firstName.setText("Albert");
        binding.lastName.setText("Einstein");
    }
}
