package ru.lunegov91.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.lunegov91.remindme.fragments.ExampleFrgament;

/**
 * Created by Антон on 30.09.2015.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    String[] tabs;
    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFrgament.getInstance();
            case 1:
                return ExampleFrgament.getInstance();
            case 2:
                return ExampleFrgament.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
