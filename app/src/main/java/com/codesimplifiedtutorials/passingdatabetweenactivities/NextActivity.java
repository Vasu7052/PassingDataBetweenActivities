package com.codesimplifiedtutorials.passingdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView tv = (TextView) findViewById(R.id.textViewPass);

        Intent i = getIntent();
        String data = i.getStringExtra("Key");

        tv.setText(data);


    }
}
