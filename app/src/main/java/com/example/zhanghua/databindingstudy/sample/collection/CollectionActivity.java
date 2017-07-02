package com.example.zhanghua.databindingstudy.sample.collection;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;

import com.example.zhanghua.databindingstudy.R;
import com.example.zhanghua.databindingstudy.databinding.ActivityCollectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollectionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);

//1. List
        List<String> list = new ArrayList<>();
        list.add("list(0)");
        list.add("list(1)");
        list.add("list(2)");
//2. SparseArray
        SparseArray<String> sparse = new SparseArray<>(2);
        sparse.put(0, "sparse(0,value0)");
        sparse.put(1, "sparse(1,value1)");
        sparse.put(2, "sparse(2,value2)");
//3. Map<String, String>
        Map<String, String> map = new HashMap<>();
        map.put("firstName", "Zhang");
        map.put("lastName", "Huakai");

        String key = "lastName";
        int index = 1;

        binding.setList(list);
        binding.setSparse(sparse);
        binding.setMap(map);
        binding.setIndex(index);
        binding.setKey(key);
    }
}
