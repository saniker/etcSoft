package com.owl.appsite;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AppSite extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        // alpha, scale animation Àû¿ë

        ImageView image = (ImageView) findViewById(R.id.img_app_mark);
        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.tween);
        image.startAnimation(alphaAnim);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_app_site, menu);
        return true;
    }
}
