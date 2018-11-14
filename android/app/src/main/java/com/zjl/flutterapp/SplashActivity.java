package com.zjl.flutterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2018/11/14 0014.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        findViewById(R.id.go_flutter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.go_flutter2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Flutter和android结合界面
                Intent intent = new Intent(SplashActivity.this, MainActivity2.class);
                SplashActivity.this.startActivity(intent);
            }
        });
    }
}
