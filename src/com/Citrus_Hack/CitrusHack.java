package com.Citrus_Hack;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CitrusHack extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button button;
    Button call;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();

        call = (Button) findViewById(R.id.button2);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg1) {
                Intent callIntent;
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9111"));
                startActivity(callIntent);
            }
        });
    }



    private void addListenerOnButton() {

        final Context context = this;
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
        });

    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Intent i = new Intent(this, FragmentLaunchDialog.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    }*/


}
