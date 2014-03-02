package com.Citrus_Hack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.util.Log;
import android.widget.Toast;
import android.telephony.TelephonyManager;

/**
 * Created by Keno on 3/1/14.
 */
public class OutgoingCallReceiver extends BroadcastReceiver {

    static MyPhoneStateListener myPhoneStateListener;
    @Override
    public void onReceive(Context context, Intent intent) {
        //Intent serviceIntent = new Intent(context, RunningService.class);
        //context.startService(serviceIntent);

        Log.w("OutgoingCallReceiver", "context: " + context);

        TelephonyManager TelephonyMgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if(myPhoneStateListener == null)
        {
            myPhoneStateListener = new MyPhoneStateListener(context);
            TelephonyMgr.listen(myPhoneStateListener,PhoneStateListener.LISTEN_CALL_STATE);
        }


        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        Log.d(OutgoingCallReceiver.class.getSimpleName(), intent.toString() + ", call to: " + phoneNumber);
        Toast.makeText(context, "Outgoing call catched: " + phoneNumber, Toast.LENGTH_LONG).show();
        //TODO: Handle outgoing call event here0


    }
}