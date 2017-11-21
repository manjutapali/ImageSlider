package com.manjunathtapali.imageslider.Slider.Views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by tapalim on 11/21/17.
 */

public class OuterLayout extends RelativeLayout {
    public OuterLayout(Context context) {
        super(context);
    }

    public OuterLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OuterLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public OuterLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
