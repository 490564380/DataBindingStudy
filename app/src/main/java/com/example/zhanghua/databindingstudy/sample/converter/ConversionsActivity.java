package com.example.zhanghua.databindingstudy.sample.converter;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityConversionsBinding;
import com.example.zhanghua.databindingstudy.sample.BaseActivity;
import com.example.zhanghua.databindingstudy.utils.ScreenUtils;

public class ConversionsActivity extends BaseActivity {

    private ObservableBoolean mIsError = new ObservableBoolean();
    private ActivityConversionsBinding binding;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_conversions);

        mIsError.set(true);
        binding.setIsError(mIsError);
        binding.setHeight(ScreenUtils.dp2px(this, 100));
    }

    public void toggleIsError(View view) {
        mIsError.set(!mIsError.get());
        i++;
        binding.setHeight(ScreenUtils.dp2px(this, 100 + i * 10));
    }

    @BindingAdapter("layout_height")
    public static void setLayoutHeight(View view, float height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) height;
        view.setLayoutParams(params);
    }

    /**
     * !!! Binding conversion should be forbidden, otherwise it will conflict with
     * {@code android:visiblity} attribute.
     */
/*    @BindingConversion
    public static int convertColorToString(int color) {
        switch (color) {
            case Color.RED:
                return R.string.red;
            case Color.WHITE:
                return R.string.white;
        }
        return R.string.app_name;
    }*/
}
