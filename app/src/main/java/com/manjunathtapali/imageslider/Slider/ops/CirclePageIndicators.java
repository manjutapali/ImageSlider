package com.manjunathtapali.imageslider.Slider.ops;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
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
        int items = pager.getAdapter().getCount();

        if(items < 0 || indicator == null) { return; }

        ImageView views[] = new ImageView[items];

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
    }

}
