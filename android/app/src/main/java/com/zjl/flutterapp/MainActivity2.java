package com.zjl.flutterapp;

import android.content.Intent;
import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

/**
 * Flutter来启动原生的界面SplashActivity
 */

public class MainActivity2 extends FlutterActivity {

    private static final String CHANNEL = "demo.plugin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 自定义插件
        new MethodChannel(getFlutterView(), CHANNEL).setMethodCallHandler(new MethodChannel.MethodCallHandler() {
            @Override
            public void onMethodCall(MethodCall call, MethodChannel.Result result) {
                if (call.method.equals("interaction")) {
                    Intent intent = new Intent(MainActivity2.this, SplashActivity.class);
                    startActivity(intent);
                    result.success("success");
                } else {
                    result.notImplemented();
                }
            }
        });

        GeneratedPluginRegistrant.registerWith(this);

    }
}
