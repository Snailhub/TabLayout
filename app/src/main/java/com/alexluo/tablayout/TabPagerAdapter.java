package com.alexluo.tablayout;

import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by alexluo on 17-12-15.
 *
 *
 * @see {@link android.support.v4.view.PagerAdapter}
 */

public abstract class TabPagerAdapter extends PagerAdapter {


    /**
     * This method may be called by the ViewPager to obtain a drawable
     * to describe the specified page. This method may return null
     * indicating no drawable for this page. The default implementation returns
     * null.
     *
     * @param position The position of the drawable requested
     * @return drawable for the requested page
     */
    public Drawable getPagerIcon(int position){
        return null;
    }

}
