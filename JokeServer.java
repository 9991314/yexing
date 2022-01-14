package com.example.zheng.yexing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class JokeServer extends BroadcastReceiver {
    static final String action_boot="android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent)
    {
		if (intent.getAction().equals(action_boot)){
			Intent startIntent=new Intent(context,JokeActivity.class); //接收到广播后，跳转JokeActivity
			context.startActivity(startIntent);
		}
    }
}
