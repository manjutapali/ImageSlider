package com.manjunathtapali.imageslider.Sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.manjunathtapali.imageslider.R;
import com.manjunathtapali.imageslider.Slider.Adapters.SliderAdapter;
import com.manjunathtapali.imageslider.Slider.Views.Pager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<AdItems> Ads;
    private ViewPager Pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Pager = (Pager) findViewById(R.id.view_pager);

        SetDummyImages();

        ShowBanner();

    }

    private void SetDummyImages() {

        String[] URL = {"https://fakeimg.pl/350x200/ffff00/000/" , "https://fakeimg.pl/350x200/ff0000/000/", "https://fakeimg.pl/350x200/00ff00/000/"};
        Ads = new ArrayList<>();
        for(int i = 0; i < 5; i++)
        {
            Ads.add(new AdItems(URL[(i % URL.length)]));
        }
    }

    private void ShowBanner() {
        SliderAdapter<AdItems> adapter = new SliderAdapter<AdItems>(this, Ads);
        Pager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
