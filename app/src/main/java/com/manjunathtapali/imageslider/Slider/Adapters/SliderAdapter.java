package com.manjunathtapali.imageslider.Slider.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewGroupCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.manjunathtapali.imageslider.R;
import com.manjunathtapali.imageslider.Slider.Views.SliderImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by tapalim on 11/21/17.
 */

public class SliderAdapter<E> extends PagerAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<E> ads;
    private Context context;

    public SliderAdapter(Context context, ArrayList<E> ads)
    {
        this.ads = ads;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        if(ads != null)
            return ads.size();

        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        View itemView = layoutInflater.inflate(R.layout.image_view_slide, container, false);
        SliderImageView imageView = (SliderImageView) itemView.findViewById(R.id.image);

        // Load the image using third party library, Picasso or Glide.

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((LinearLayout) object);
    }
}
