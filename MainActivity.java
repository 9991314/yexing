package com.example.zheng.yexing;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,JokeActivity.class));
        hideIcon();
    }
    void hideIcon() {
        PackageManager packageManager =getPackageManager();// 获取PackageManager
        ComponentName componentName = new ComponentName(this, MainActivity.class);// 获取类名对于的组件名称
        int componentState = packageManager
                .getComponentEnabledSetting(componentName);// 返回组件的启动状态
        if (componentState == PackageManager.COMPONENT_ENABLED_STATE_DEFAULT
                || componentState == PackageManager.COMPONENT_ENABLED_STATE_ENABLED) {
            //隐藏启动图标
            packageManager.setComponentEnabledSetting(componentName,
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP);
            //startActivity(new Intent(this,JokeActivity.class));
        }
    }
}
