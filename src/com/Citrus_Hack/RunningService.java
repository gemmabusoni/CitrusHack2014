package com.Citrus_Hack;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by Keno on 3/1/14.
 */
public class RunningService extends IntentService{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public RunningService() {
        super("RunningService");
    }

    @Override
    protected void onHandleIntent(Intent arg0) {
        MyPhoneStateListener myPhoneStateListener = new MyPhoneStateListener(this);
        Log.w("Service", "Service has started");
    }
}
