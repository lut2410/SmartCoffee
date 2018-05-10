package com.example.lhtv.smartcoffe.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.category.table.TableAdapter;
import com.example.lhtv.smartcoffe.module.TableDrink;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by LHTV on 4/17/2018.
 */

public class FragmentSEO extends Fragment{

    @BindView(R.id.seo_recyclerView)
    RecyclerView recyclerView;
    private View mView;
    private GridLayoutManager gridLayoutManager;
    public FragmentSEO(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mView = inflater.inflate(R.layout.fragment_seo,container,false);
        try{
            ButterKnife.bind(this,mView);
        }catch (Exception e){
            e.printStackTrace();
        }
        gridLayoutManager = new GridLayoutManager(getContext(),3);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);

        SEORecyclerViewAdapter adapter = new SEORecyclerViewAdapter(getContext(), Instance.tableDrinkList, new SEORecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(TableDrink item) {
                Toast.makeText(getContext(), ""+item.name, Toast.LENGTH_SHORT).show();
                Instance.tableDrinkItemSelected = item;
                startActivity(new Intent(getActivity(),TableSEOActivity.class));
                getActivity().finish();
            }
        });
        recyclerView.setAdapter(adapter);
        return mView;
    }
}
