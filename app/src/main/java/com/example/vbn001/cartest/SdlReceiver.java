package com.example.vbn001.cartest;

import android.content.Context;
import android.content.Intent;

import com.smartdevicelink.transport.*;
import com.smartdevicelink.transport.SdlRouterService;

/**
 * Created by vbn001 on 8/11/17.
 */

public class SdlReceiver extends SdlBroadcastReceiver {
    @Override
    public Class<? extends SdlRouterService> defineLocalSdlRouterClass() {
        return com.example.vbn001.cartest.SdlRouterService.class;
    }

    @Override
    public void onSdlEnabled(Context context, Intent intent) {
        intent.setClass(context, SdlService.class);
        context.startService(intent);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        //your code here
    }
}
