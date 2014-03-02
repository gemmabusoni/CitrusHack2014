package com.Citrus_Hack;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.DialogFragment;

/**
 * Created by Keno on 3/2/14.
 */
public class FragmentLaunchDialog extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        showEditDialog();
    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        SendingSirenDialogFragment editNameDialog = SendingSirenDialogFragment.newInstance("Some Title");
        editNameDialog.show(fm, "fragment_edit_name");
    }
}