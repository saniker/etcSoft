package com.owl.appsite;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AppSite extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        // alpha, scale animation 적용

        ImageButton imgBtn1 = (ImageButton) findViewById(R.id.img_app_mark);
        imgBtn1.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AppSite.this, MainSite.class);
                startActivity(intent);
            }
        });

        ImageButton imgBtn2 = (ImageButton) findViewById(R.id.anim_bg);
        imgBtn2.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AppSite.this, MainSite.class);
                startActivity(intent);
            }
        });
//        Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.tween);
//        image.startAnimation(alphaAnim);

        // frame animation

//        ImageView img = (ImageView) findViewById(R.id.anim_bg);
//        img.setBackgroundResource(R.drawable.anim_list);
//
//        AnimationDrawable fromAnimation = (AnimationDrawable) img.getBackground();
//        fromAnimation.start();

        // 위 코드와 아래 코드 차이점이 없는데?
        // 위에 코드가 더 좋은듯...

        ImageView img = (ImageView) findViewById(R.id.anim_bg);
        img.setBackgroundResource(R.drawable.anim_list);

        SlideStart slideStart = new SlideStart();
        SlideEnd slideEnd = new SlideEnd();

        Timer startTimer = new Timer(false);
        startTimer.schedule(slideStart, 1000);
        // 1초마다 실행되면 fromAnimation.start(); 이 부분이
        // 반복 호출되는데, 이상이 없나?

        Timer endTimer = new Timer(false);
        endTimer.schedule(slideEnd, 10000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_app_site, menu);
        return true;
    }

    class SlideStart extends TimerTask {

        @Override
        public void run() {
            ImageView img = (ImageView) findViewById(R.id.anim_bg);
            AnimationDrawable fromAnimation = (AnimationDrawable) img.getBackground();
            fromAnimation.start();
        }
    }

    class SlideEnd extends TimerTask {

        @Override
        public void run() {
            ImageView img = (ImageView) findViewById(R.id.anim_bg);
            AnimationDrawable fromAnimation = (AnimationDrawable) img.getBackground();
            fromAnimation.stop();
        }
    }
}
