package com.owl.appsite;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class AppSite extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

//        ImageView image = new ImageView(this);
//        image.setImageResource(R.drawable.app_mark);
//        setContentView(image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_app_site, menu);
        return true;
    }
}
