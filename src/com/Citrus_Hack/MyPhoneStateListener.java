package com.Citrus_Hack;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Keno on 3/1/14.
 */
public class MyPhoneStateListener extends PhoneStateListener {

    Context context;

    int pastState;

    public MyPhoneStateListener()
    {}

    public MyPhoneStateListener(Context c)
    {
        this.context = c;
        Log.w("MyPhoneStateListener", "Phone State Listener started." + c.toString());
    }

    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        Log.w("MyPhoneStateListener", "ello.");

        switch (state) {
            //Hangup
            case TelephonyManager.CALL_STATE_IDLE:
            {
              //  Toast.makeText(context, "Your Message", Toast.LENGTH_LONG).show();
                Log.w("MyPhoneStateListener", "TelephonyManager.CALL_STATE_IDLE");


                if (pastState == TelephonyManager.CALL_STATE_OFFHOOK )
                {
                    Log.w("MyPhoneStateListener", "User Hung Up." + context);
                    Intent intent= new Intent(context, FragmentLaunchDialog.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                }

                 pastState = TelephonyManager.CALL_STATE_IDLE;
                break;
            }
            //Outgoing
            case TelephonyManager.CALL_STATE_OFFHOOK:
            {
               // Toast.makeText(context, "Your Message", Toast.LENGTH_LONG).show();
                pastState = TelephonyManager.CALL_STATE_OFFHOOK;
                Log.w("MyPhoneStateListener", "TelephonyManager.CALL_STATE_OFFHOOK");
                break;
            }

            //Incoming
            case TelephonyManager.CALL_STATE_RINGING:
            {
               // Toast.makeText(context, "Your Message", Toast.LENGTH_LONG).show();
                Log.w("MyPhoneStateListener", "TelephonyManager.CALL_STATE_RINGING");

                pastState = TelephonyManager.CALL_STATE_RINGING;
                break;
            }
        }
    }

    /*
    }*/
}