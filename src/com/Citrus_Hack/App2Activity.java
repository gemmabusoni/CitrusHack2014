package com.Citrus_Hack;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.Citrus_Hack.R;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by Daniel on 3/1/14.
 */
public class App2Activity extends Activity{


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        Button buttonSecond = (Button) findViewById(R.id.button3);
        buttonSecond.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent activityChangeIntent = new Intent(App2Activity.this, App3Activity.class);
                App2Activity.this.startActivity(activityChangeIntent);


            }
        });

    }


}