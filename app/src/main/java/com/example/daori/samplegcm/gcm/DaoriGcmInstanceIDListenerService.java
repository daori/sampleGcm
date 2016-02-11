package com.example.daori.samplegcm.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by daori on 2/11/16.
 */
public class DaoriGcmInstanceIDListenerService extends InstanceIDListenerService{

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
