package com.manjunathtapali.imageslider.Slider.Views;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by tapalim on 11/23/17.
 */

public class CircleIndicators extends LinearLayout {
    public CircleIndicators(Context context) {
        super(context);
    }

    public CircleIndicators(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleIndicators(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CircleIndicators(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
