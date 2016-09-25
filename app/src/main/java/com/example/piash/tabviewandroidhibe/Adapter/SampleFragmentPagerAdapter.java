package com.example.piash.tabviewandroidhibe.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.piash.tabviewandroidhibe.Fragment.FirstFragment;
import com.example.piash.tabviewandroidhibe.Fragment.SecondFragment;

/**
 * Created by piash on 9/25/16.
 */

public class SampleFragmentPagerAdapter extends FragmentStatePagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Home", "Crazy" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FirstFragment();
        }else if (position == 1){
            return new SecondFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        /*switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Crazy";
        }
        return null;*/

        return tabTitles[position];
    }
}
