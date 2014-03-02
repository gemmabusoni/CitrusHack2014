package com.Citrus_Hack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import com.Citrus_Hack.R;


/**
 * Created by Daniel on 3/1/14.
 */
public class AppActivity extends Activity {

        Button button;
        Button call;

        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            addListenerOnButton();

         call = (Button) findViewById(R.id.button2);

         call.setOnClickListener(new OnClickListener() {
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

            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    Intent intent = new Intent(context, App2Activity.class);
                    startActivity(intent);
                }
            });

    }


}
