package com.satman.satya.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }


    public void method12(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(FourthActivity.this);


        builder.setTitle("AlertDialog Example");


        builder.setMessage("This is an Example of Android AlertDialog with 3 Buttons!!");


        //Button One : Yes
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FourthActivity.this, "Yes button Clicked!", Toast.LENGTH_LONG).show();
            }
        });


        //Button Two : No
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FourthActivity.this, "No button Clicked!", Toast.LENGTH_LONG).show();
                dialog.cancel();
            }
        });


        //Button Three : Neutral
        builder.setNeutralButton("Can't Say!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FourthActivity.this, "Neutral button Clicked!", Toast.LENGTH_LONG).show();
                dialog.cancel();
            }
        });


        AlertDialog diag = builder.create();
        diag.show();



    }



}
