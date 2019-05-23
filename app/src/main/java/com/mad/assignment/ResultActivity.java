package com.mad.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView result = (TextView)findViewById(R.id.resultView);
        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("SUM");
        result.setText(addition);

    }
}
