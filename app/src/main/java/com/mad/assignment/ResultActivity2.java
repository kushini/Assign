package com.mad.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2);
        TextView result = (TextView)findViewById(R.id.resultView);
        Intent intent = getIntent();
        String subtraction = (String)intent.getSerializableExtra("SUB");
        result.setText(subtraction);
    }
}
