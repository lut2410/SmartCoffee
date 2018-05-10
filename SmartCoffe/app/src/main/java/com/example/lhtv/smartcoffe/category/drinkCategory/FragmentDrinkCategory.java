package com.example.lhtv.smartcoffe.category.drinkCategory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LHTV on 4/16/2018.
 */

public class FragmentDrinkCategory extends Fragment {
    @BindView(R.id.listView_drink_category)
    ListView listView;
    private View mView;
    public FragmentDrinkCategory(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mView = inflater.inflate(R.layout.fragment_drink_category,container,false);
        try{
            ButterKnife.bind(this,mView);
        }catch (Exception e){
            e.printStackTrace();
        }

        listView.setAdapter(new DrinkCategoryAdapter(getActivity(), Instance.drinkCategoryList));
        listView.setSmoothScrollbarEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), ""+Instance.drinkCategoryList.get(position).id, Toast.LENGTH_SHORT).show();
            }
        });

        return mView;
    }

}
