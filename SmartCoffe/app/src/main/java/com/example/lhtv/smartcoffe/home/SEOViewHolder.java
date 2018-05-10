package com.example.lhtv.smartcoffe.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.R;

import butterknife.BindView;

/**
 * Created by LHTV on 4/17/2018.
 */

public class SEOViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textTable;
    public TextView textViewStatus;
    public LinearLayout rootLayout;
    public SEOViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        textTable = (TextView) itemView.findViewById(R.id.text_table_drink);
        textViewStatus = (TextView)itemView.findViewById(R.id.text_status_table_drink);
        rootLayout = (LinearLayout)itemView.findViewById(R.id.root);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "" + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
