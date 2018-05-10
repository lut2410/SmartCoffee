package com.example.lhtv.smartcoffe.category.drinkCategory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.module.DrinkCategory;

import java.util.List;

/**
 * Created by LHTV on 4/16/2018.
 */

public class DrinkCategoryAdapter extends BaseAdapter{

    private Context mContext;
    private List<DrinkCategory> mList;

    public DrinkCategoryAdapter(Context context, List<DrinkCategory> list){
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = null;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            v = inflater.inflate(R.layout.drink_category_item,null);

        }else{
            v = convertView;
        }
        ((TextView)v.findViewById(R.id.textView_category_id)).setText(String.valueOf(mList.get(position).id));
        ((TextView)v.findViewById(R.id.textView_category_name)).setText(mList.get(position).name);
        return v;
    }
}
