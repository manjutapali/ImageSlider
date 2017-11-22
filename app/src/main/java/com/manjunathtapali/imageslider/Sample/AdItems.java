package com.manjunathtapali.imageslider.Sample;

import com.manjunathtapali.imageslider.Slider.Interfaces.PagerExecutables;

/**
 * Created by tapalim on 11/22/17.
 */

public class AdItems implements PagerExecutables {

    private String URL;

    public AdItems(String URL)
    {
        this.URL = URL;
    }

    @Override
    public String GetImageURL() {
        return URL;
    }
}
