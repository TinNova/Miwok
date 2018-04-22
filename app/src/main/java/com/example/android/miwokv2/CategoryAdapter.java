package com.example.android.miwokv2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * This Class handles how the swiping action occurs and the men
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;
    }


    // Here we specify which category should display at each position, position 0 == the first position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyMembersFragment();
        } else if (position == 2) {
            return new ColoursFragment();
        } else {
            return new PhrasesFragment();
        }

    }


    // Here we specify how many pages we have
    @Override
    public int getCount() {
        return 4;
    }


    // Here we specify the names of the menu items in the tab layout
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
    }

}
