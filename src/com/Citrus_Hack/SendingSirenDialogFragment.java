package com.Citrus_Hack;

import android.app.AlertDialog;
import android.app.Dialog;
//import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.DialogFragment;

/**
 * Created by Keno on 3/2/14.
 */
public class SendingSirenDialogFragment extends DialogFragment {

    public SendingSirenDialogFragment() {
    }

    public static SendingSirenDialogFragment newInstance(String title) {
        SendingSirenDialogFragment frag = new SendingSirenDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Activate Siren?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.w(" SendingSirenDialogFragment", "Yes button is pressed.");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.w(" SendingSirenDialogFragment", "No button is pressed.");
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
