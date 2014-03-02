package com.Citrus_Hack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;
import android.view.View.OnClickListener;

public class App3Activity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);

//        Button buttonThird = (Button) findViewById(R.id.textView);
//        buttonThird.setOnClickListener(new OnClickListener(){
//            public void onClick(View v){
//            Intent activityChangeIntent = new Intent(App3Activity.this, App4Activity.class);
//            App3Activity.this.startActivity(activityChangeIntent);
//            }
//        });
    }
}
