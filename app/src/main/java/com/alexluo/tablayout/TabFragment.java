package com.alexluo.tablayout;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;

/**
 * Created by alexluo on 17-12-15.
 */

public class TabFragment extends Fragment {

    private CharSequence mTitle;

    private Drawable mIcon;

    public CharSequence getTitle(){
        return mTitle;
    }

    public void setTitle(CharSequence title){
        mTitle = title;
    }


    public void setIcon(Drawable icon){
        mIcon = icon;
    }

    public Drawable getIcon(){
        return mIcon;
    }




}
