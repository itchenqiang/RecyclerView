package com.chen.testrecyclerview;

import android.view.View;
import android.widget.TextView;

/**
 * OneViewHolder
 * Created by Administrator on 2016/11/30.
 */
public class OneViewHolder extends BaseDemoViewHolder {

    public TextView textView;

    public OneViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }

    @Override
    public void bindHolder(DemoModel model) {
    }

}
