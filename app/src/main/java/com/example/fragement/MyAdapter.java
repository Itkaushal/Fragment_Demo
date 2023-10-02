package com.example.fragement;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter{

    Context context;
    int totalTabs;

    public MyAdapter(FragmentManager fm, int totalTabs,Context c) {
        super(fm);
        context= c;
        this.totalTabs=totalTabs;
    }

    public MyAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager, tabCount);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position) {
           case 0:
               Home homeFragment = new Home();
               return homeFragment;
           case 1:
               About aboutFragment = new About();
               return aboutFragment;
           case 2:
               Blog blogFragment = new Blog();
               return blogFragment;
           default:
               return null;
       }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

