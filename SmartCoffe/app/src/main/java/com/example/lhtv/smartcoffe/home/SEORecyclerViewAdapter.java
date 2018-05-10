package com.example.lhtv.smartcoffe.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.category.drink.DrinkAdapter;
import com.example.lhtv.smartcoffe.module.TableDrink;

import java.util.List;

/**
 * Created by LHTV on 4/17/2018.
 */

public class SEORecyclerViewAdapter extends RecyclerView.Adapter<SEOViewHolder> {

    private final List<TableDrink> itemList;
    private final OnItemClickListener listener;
    private Context context;
    public SEORecyclerViewAdapter(Context context, List<TableDrink> list,OnItemClickListener listener){
        this.context = context;
        this.itemList = list;
        this.listener = listener;
    }
    @Override
    public SEOViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.table_drink_item, parent, false);
        SEOViewHolder rcv = new SEOViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(SEOViewHolder holder, int position) {
        final TableDrink item = itemList.get(position);
        holder.textTable.setText(item.name);
        switch (item.status){
            case 0 :
                holder.textViewStatus.setText("Trống");
                break;
            case 1:
                holder.textViewStatus.setText("Đang làm");
                break;
            case 2:
                holder.textViewStatus.setText("Có người");
                break;
            case 3:
                holder.textViewStatus.setText("Tính tiền");
                break;
        }
        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
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
        void onItemClick(TableDrink item);
    }
}
