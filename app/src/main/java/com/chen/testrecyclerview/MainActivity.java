package com.chen.testrecyclerview;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] avatar = {android.R.color.holo_orange_dark, android.R.color.holo_red_light};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        ArrayList<DemoModel> demoModels = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            DemoModel demoModel = new DemoModel();
            demoModel.type = (int) ((Math.random() * 3) + 1);
            demoModel.color = avatar[i % 2];
            demoModels.add(demoModel);
        }
        DemoAdapter demoAdapter = new DemoAdapter(this);
        recyclerView.setAdapter(demoAdapter);
        demoAdapter.setData(demoModels);
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 10;
                outRect.top = 10;
            }
        });
    }
}
