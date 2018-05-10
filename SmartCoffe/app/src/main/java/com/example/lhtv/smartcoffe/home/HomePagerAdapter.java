package com.example.lhtv.smartcoffe.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by LHTV on 4/17/2018.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new FragmentSEO();
                Bundle bundle = new Bundle();
                bundle.putInt("homePosition",0);
                fragment.setArguments(bundle);
                break;
            case 1:
                fragment = new FragmentWaiting();
                bundle = new Bundle();
                bundle.putInt("homePosition",1);
                fragment.setArguments(bundle);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Bán Hàng" ;
                break;
            case 1:
                title = "Đang chờ";
                break;
        }
        return title;
    }
}
