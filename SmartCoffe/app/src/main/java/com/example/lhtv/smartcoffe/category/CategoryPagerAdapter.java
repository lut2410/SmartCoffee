package com.example.lhtv.smartcoffe.category;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lhtv.smartcoffe.category.drink.FragmentDrink;
import com.example.lhtv.smartcoffe.category.drinkCategory.FragmentDrinkCategory;
import com.example.lhtv.smartcoffe.category.table.FragmentTable;

/**
 * Created by LHTV on 4/16/2018.
 */

public class CategoryPagerAdapter extends FragmentPagerAdapter {
    public CategoryPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new FragmentTable();
                Bundle bundle = new Bundle();
                bundle.putInt("position",0);
                fragment.setArguments(bundle);
                break;
            case 1:
                fragment = new FragmentDrinkCategory();
                bundle = new Bundle();
                bundle.putInt("position",1);
                fragment.setArguments(bundle);
                break;
            case 2:
                fragment = new FragmentDrink();
                bundle = new Bundle();
                bundle.putInt("position",2);
                fragment.setArguments(bundle);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Bàn" ;
                break;
            case 1:
                title = "Danh mục";
                break;
            case 2:
                title = "Đồ uống";
                break;
        }
        return title;
    }
}
