package com.example.lhtv.smartcoffe.home.add_bill_info;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.home.SEOViewHolder;
import com.example.lhtv.smartcoffe.module.Drink;

import java.util.List;

/**
 * Created by LHTV on 5/8/2018.
 */

public class AddBillInfoAdapter extends RecyclerView.Adapter<AddBillInfoViewHolder> {
    private final List<Drink> itemList;
    private final Context mContext;
    private final OnItemClickListener listener;

    public AddBillInfoAdapter(List<Drink> itemList,Context mContext, OnItemClickListener listener) {
        this.itemList = itemList;
        this.mContext = mContext;
        this.listener = listener;
    }

    @Override
    public AddBillInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_bill_info_item, parent, false);
        AddBillInfoViewHolder rcv = new AddBillInfoViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(AddBillInfoViewHolder holder, int position) {
        final Drink item = itemList.get(position);
        holder.textViewDrinkName.setText(item.name);
        holder.layoutRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
    public interface OnItemClickListener{
        void onItemClick(Drink item);
    }
}
