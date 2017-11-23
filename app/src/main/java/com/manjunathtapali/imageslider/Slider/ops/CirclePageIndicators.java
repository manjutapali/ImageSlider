package com.manjunathtapali.imageslider.Slider.ops;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.manjunathtapali.imageslider.R;
import com.manjunathtapali.imageslider.Slider.Views.CircleIndicators;
import com.manjunathtapali.imageslider.Slider.Views.Pager;

/**
 * Created by tapalim on 11/23/17.
 */

public class CirclePageIndicators
{
    private Context context;
    private Pager pager;
    private CircleIndicators indicator;
    private ViewPager.OnPageChangeListener pageChangeListener;
    private ImageView views[];
    private int items;

    public CirclePageIndicators(Context context, Pager pager)
    {
        this.context = context;
        this.pager = pager;
    }

    public void setIndicator(CircleIndicators indicator)
    {
        this.indicator = indicator;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Indicate()
    {
        items = pager.getAdapter().getCount();

        if(items < 0 || indicator == null) { return; }

        views = new ImageView[items];

        for(int i = 0; i < items; i++)
        {
            views[i] = new ImageView(context);

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                views[i].setImageDrawable(context.getDrawable(R.drawable.no_selected_circle));
            else
                views[i].setImageDrawable(context.getResources().getDrawable(R.drawable.no_selected_circle));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);

            params.setMargins(4, 0, 4, 0);

            indicator.addView(views[i], params);
        }

        views[0].setImageDrawable(context.getDrawable(R.drawable.selected_circle));

        AddPageListener();

        pager.addOnPageChangeListener(pageChangeListener);
    }

    private void AddPageListener() {

        pageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onPageSelected(int position) {

                //Log.e("Position", " = " + position);
                for(int i = 0; i < items; i++)
                {
                    views[i].setImageDrawable(context.getDrawable(R.drawable.no_selected_circle));
                }

                views[position].setImageDrawable(context.getDrawable(R.drawable.selected_circle));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        };
    }

}
