package com.example.zhanghua.databindingstudy.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.zhanghua.databindingstudy.BR;


public class ObservableUser extends BaseObservable {
    private String mFirstName;
    private String mLastName;

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
