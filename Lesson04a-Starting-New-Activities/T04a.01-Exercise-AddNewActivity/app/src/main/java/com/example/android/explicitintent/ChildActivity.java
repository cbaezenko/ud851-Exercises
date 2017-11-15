package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by baeza on 15.11.2017.
 */


public class ChildActivity extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedinstance){
        super.onCreate(savedinstance);
        setContentView(R.layout.child_activity);

        mTextView = (TextView) findViewById(R.id.tv_display);
    }
}
