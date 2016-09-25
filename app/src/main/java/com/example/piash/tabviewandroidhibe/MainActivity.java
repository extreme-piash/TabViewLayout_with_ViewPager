package com.example.piash.tabviewandroidhibe;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.piash.tabviewandroidhibe.Adapter.SampleFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    SampleFragmentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        // Give the TabLayout the ViewPager

        adapter = new SampleFragmentPagerAdapter(getFragmentManager(), getApplication());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
