package com.chen.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * OneViewHolder
 * Created by Administrator on 2016/11/30.
 */
public abstract class BaseDemoViewHolder extends RecyclerView.ViewHolder {

    public BaseDemoViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindHolder(DemoModel model);

}
