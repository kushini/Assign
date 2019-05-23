package com.mad.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result4);
        TextView result = (TextView)findViewById(R.id.resultView);
        Intent intent = getIntent();
        String divition = (String)intent.getSerializableExtra("DIV");
        result.setText(divition);
    }
}
