package com.arcdrive.arc;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;



public class ViewDialog {

     Dialog dialog;

    public void showDialog(final Activity activity) {


         dialog = new Dialog(activity);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.popup);

    }

    public void closeDialog (){
        dialog.dismiss();
    }
}