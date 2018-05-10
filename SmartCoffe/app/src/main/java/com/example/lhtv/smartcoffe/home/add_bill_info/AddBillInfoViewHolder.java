package com.example.lhtv.smartcoffe.home.add_bill_info;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lhtv.smartcoffe.R;

/**
 * Created by LHTV on 5/8/2018.
 */

public class AddBillInfoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//    public TextView textViewCount;
    public TextView textViewDrinkName;
    public LinearLayout layoutRoot;
    public AddBillInfoViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        textViewDrinkName = (TextView) itemView.findViewById(R.id.textView_drink_name);
        layoutRoot = (LinearLayout) itemView.findViewById(R.id.add_bill_info_root);
    }

    @Override
    public void onClick(View v) {

    }
}
