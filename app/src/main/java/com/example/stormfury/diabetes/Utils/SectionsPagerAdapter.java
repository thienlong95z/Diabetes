package com.example.stormfury.diabetes.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.stormfury.diabetes.Home.CameraFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stormfury on 2/22/2018.
 */

/**
 * Class that stores fragments for tabs
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPagerAdapter";

    private final List<CameraFragment> mFragmentList = new ArrayList<CameraFragment>();


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }


    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(CameraFragment fragment){
        mFragmentList.add(fragment);
    }

}
