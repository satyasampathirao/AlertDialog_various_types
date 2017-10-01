package com.satman.satya.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }



    public void method11(View view){


       /* AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getApplication(), R.style.dialogTheme);

        //  alertDialogBuilder.setView(subView);

        alertDialogBuilder.setCancelable(true);
        alertDialogBuilder.setTitle("Employee Added Successfully");
        alertDialogBuilder.setMessage("Select Employee in Home Page to get Login Details");
        //negative button




        alertDialogBuilder.setNeutralButton("OK", new DialogInterface.OnClickListener()

                {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        finish();
                    }
                }

        );


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();*/


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ThirdActivity.this, R.style.dialogTheme);

       // alertDialogBuilder.setView(view);

        alertDialogBuilder.setCancelable(true);

        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                       // dialogInterface.cancel();

                       // Log.d("testphone",phoneNumberString);

////
                     //   sendemail();





                    }
                }

        );


        //negative button


       /* alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener()

                {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }

        );
*/
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();







    }










}
