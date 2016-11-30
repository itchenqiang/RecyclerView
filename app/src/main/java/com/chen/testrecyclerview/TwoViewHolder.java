package com.chen.testrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * OneViewHolder
 * Created by Administrator on 2016/11/30.
 */
public class TwoViewHolder extends BaseDemoViewHolder {

    public ImageView imageView;
    public TextView textView;

    public TwoViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }

    @Override
    public void bindHolder(DemoModel model) {
        imageView.setBackgroundResource(model.color);
    }

}
