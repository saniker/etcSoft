package com.example.hellowandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HellowAndroid extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellow_android);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hellow_android, menu);
        return true;
    }
}
