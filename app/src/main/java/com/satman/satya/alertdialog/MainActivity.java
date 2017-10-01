package com.satman.satya.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         /* builder = new AlertDialog.Builder(FreeGameActivity.this);
            builder.setTitle("Wrong Answer");
            builder.setCancelable(false);

            builder.setNeutralButton("Sorry.. Please try again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    FreeGameActivity.this.finish();

                }
            });
            alertDialog = builder.create();
            alertDialog.show();
*/
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Wrong Answer");
        builder.setCancelable(false);
        builder.setPositiveButton("Sorry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(in);
            }
        });


        builder.setNegativeButton("DO Nothing", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


    public void method2(View view){

        startActivity(new Intent(getApplicationContext(),SecondActivity.class));
    }

    public void method3(View view){

        startActivity(new Intent(getApplicationContext(),ThirdActivity.class));

    }


    //method4

    public void method4(View view){

        startActivity(new Intent(getApplicationContext(),FourthActivity.class));

    }





}
