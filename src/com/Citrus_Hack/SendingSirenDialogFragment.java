package com.Citrus_Hack;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
//import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.support.v4.app.DialogFragment;

import java.util.ArrayList;

/**
 * Created by Keno on 3/2/14.
 */
public class SendingSirenDialogFragment extends DialogFragment{

    Activity mActivity;

    public SendingSirenDialogFragment() {
    }

    public static SendingSirenDialogFragment newInstance(String title) {
        SendingSirenDialogFragment frag = new SendingSirenDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mActivity = activity;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setMessage("Activate Siren?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.w(" SendingSirenDialogFragment", "Yes button is pressed.");
                        TagSelection();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.w(" SendingSirenDialogFragment", "No button is pressed.");
                        //((FragmentLaunchDialog)mActivity).doPositiveClick();

                        dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

   void TagSelection()
   {
       final ArrayList mSelectedItems = new ArrayList();
       CharSequence[] _options = { "Injury", "Infections", "Cardiac", "Metabolic", "Psychiatric", "Respiratory", "Uranus"};
       AlertDialog.Builder builder2 = new AlertDialog.Builder(mActivity);
       builder2.setTitle("Type of Medical Emergency:")
               .setMultiChoiceItems(_options,null, new DialogInterface.OnMultiChoiceClickListener(){
                   @Override
                   public void onClick(DialogInterface dialog, int which,
                                       boolean isChecked) {
                       if (isChecked) {
                           // If the user checked the item, add it to the selected items
                           mSelectedItems.add(which);
                       } else if (mSelectedItems.contains(which)) {
                           // Else, if the item is already in the array, remove it
                           mSelectedItems.remove(Integer.valueOf(which));
                       }
                   }
               })

               .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int id) {
                       Log.w(" SendingSirenDialogFragment", "Tags Confirmed");
                      ((FragmentLaunchDialog)mActivity).doPositiveClick();
                   }
               })
               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int id) { dismiss();  }
               });
       AlertDialog alert = builder2.create();
       alert.show();
   }


   }

 

