package com.example.zhanghua.databindingstudy.sample.observable;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityObservableBinding;
import com.example.zhanghua.databindingstudy.model.ObservableUser;
import com.example.zhanghua.databindingstudy.model.PlainUser;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;

public class ObservableActivity extends BaseActivity {

    private ObservableUser user = new ObservableUser();
    private PlainUser plainUser = new PlainUser();
    private ObservableArrayMap<String, Object> mapUser = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable);

        setMyName(null);

        binding.setUser(user);
        binding.setPlainUser(plainUser);
        binding.setMapUser(mapUser);
    }

    public void setOtherName(View view) {
        user.setFirstName("OtherFirstName");
        user.setLastName("OtherLastName");

        plainUser.firstName.set("OtherFirstName");
        plainUser.lastName.set("OtherLastName");
        plainUser.age.set(27);

        mapUser.put("firstName", "OtherFirstName");
        mapUser.put("lastName", "OtherLastName");
        mapUser.put("age", 27);
    }

    public void setMyName(View view) {
        user.setFirstName("MyFirstName");
        user.setLastName("MyLastName");

        plainUser.firstName.set("MyFirstName");
        plainUser.lastName.set("MyLastName");
        plainUser.age.set(27);

        mapUser.put("firstName", "MyFirstName");
        mapUser.put("lastName", "MyLastName");
        mapUser.put("age", 27);
    }
}
