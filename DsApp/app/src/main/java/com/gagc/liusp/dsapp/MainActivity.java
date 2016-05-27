package com.gagc.liusp.dsapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gagc.liusp.dsapp.view.NoTitleDialog;

public class MainActivity extends AppCompatActivity {


    private NoTitleDialog dialog;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        dialog = new NoTitleDialog(context);
        dialog.show();

    }
}
