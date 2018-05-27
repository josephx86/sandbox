package io.github.josephx86.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter {
    CatsFragment catsFragment = new CatsFragment();
    DogsFragment dogsFragment = new DogsFragment();

    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return catsFragment;
        } else if (position == 1) {
            return dogsFragment;
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return catsFragment.getTitle();
        } else if (position == 1) {
            return dogsFragment.getTitle();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
