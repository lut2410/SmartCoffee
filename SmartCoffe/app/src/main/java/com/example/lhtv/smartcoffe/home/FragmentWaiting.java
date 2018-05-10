package com.example.lhtv.smartcoffe.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.category.table.TableAdapter;

import butterknife.ButterKnife;

/**
 * Created by LHTV on 4/17/2018.
 */

public class FragmentWaiting extends Fragment {

    private View mView;
    public FragmentWaiting(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mView = inflater.inflate(R.layout.fragment_waiting,container,false);
        try{
            ButterKnife.bind(this,mView);
        }catch (Exception e){
            e.printStackTrace();
        }

        return mView;
    }
}
