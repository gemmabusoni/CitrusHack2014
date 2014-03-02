package com.Citrus_Hack;

import android.app.Activity;
import android.app.Fragment;
//import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.DialogFragment;
import android.util.Log;

/**
 * Created by Keno on 3/2/14.
 */
public class FragmentLaunchDialog extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        showDialog();
    }

    private void showDialog() {
        //FragmentManager fm = getSupportFragmentManager();
        //SendingSirenDialogFragment editNameDialog = SendingSirenDialogFragment.newInstance("Some Title");
        DialogFragment newFragment = SendingSirenDialogFragment.newInstance("hi");
        newFragment.show(getSupportFragmentManager(),"die");
        //editNameDialog.show(fm, "fragment_edit_name");
    }

    public void doPositiveClick() {
        // Do stuff here.
        Log.i("FragmentAlertDialog", "Positive click!");

        Intent i= new Intent(this,SendGPS.class);
        startActivity(i);
    }

}