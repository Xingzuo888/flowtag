package com.example.flowtag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.flowtag.flow.FlowTagLayout;
import com.example.flowtag.interfaces.OnTagClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FlowTagLayout flowTagLayout = findViewById(R.id.flowTag);
        TagAdapter adapter = new TagAdapter(this);
        //设置点击模式
//        三种模式：FLOW_TAG_CHECKED_NONE、FLOW_TAG_CHECKED_SINGLE、FLOW_TAG_CHECKED_MULTI
//               支持OnTagClickListener单点事件
//               支持OnTagSelectListener单选、多选事件
        flowTagLayout.setTagCheckedMode(FlowTagLayout.FLOW_TAG_CHECKED_NONE);
        flowTagLayout.setAdapter(adapter);
        flowTagLayout.setOnTagClickListener(new OnTagClickListener() {
            @Override
            public void onItemClick(FlowTagLayout parent, View view, int position) {
                Toast.makeText(MainActivity.this,(String)parent.getAdapter().getItem(position),Toast.LENGTH_SHORT).show();
            }
        });
        list.add("布局");
        list.add("beijing");
        list.add("天津市");
        list.add("阿里山");
        list.add("Holle Word");
        list.add("福地石窟");
        list.add("讽德诵功");
        list.add("的双方各");
        list.add("布审犯人隔阂和风格局");
        list.add("gft");
        list.add("fdshg");
        adapter.clearAndAddAll(list);
    }
}