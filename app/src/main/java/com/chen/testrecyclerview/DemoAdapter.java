package com.chen.testrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * DemoAdapter.class
 * Created by chen on 2016/11/29.
 */
public class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<DemoModel> mList = new ArrayList<>();
    private final LayoutInflater mInflater;

    public DemoAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<DemoModel> demoModels) {
        this.mList.addAll(demoModels);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case DemoModel.ONE_TYPE:
                return new OneViewHolder(mInflater.inflate(R.layout.item1, parent, false));
            case DemoModel.TWO_TYPE:
                return new TwoViewHolder(mInflater.inflate(R.layout.item2, parent, false));
            case DemoModel.THREE_TYPE:
                return new ThreeViewHolder(mInflater.inflate(R.layout.item3, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((BaseDemoViewHolder) holder).bindHolder(mList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).type;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
