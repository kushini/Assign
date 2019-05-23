package com.mad.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsum = (Button) findViewById(R.id.btnSum);
        Button btnsub = (Button) findViewById(R.id.btnSub);
        Button btnmul = (Button) findViewById(R.id.btnMul);
        Button btndiv = (Button) findViewById(R.id.btnDiv);

        final EditText firstNum = (EditText) findViewById(R.id.num1);
        final EditText secondNum = (EditText) findViewById(R.id.num2);


        btnsum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);


                intent.putExtra("SUM",num1+" + "+num2+" = "+(num1+num2));
                startActivity(intent);

            }
        }

        );

        btnsub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                Intent intent = new Intent(MainActivity.this,ResultActivity2.class);


                intent.putExtra("SUB",num1+" - "+num2+" = "+(num1-num2));
                startActivity(intent);

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                Intent intent = new Intent(MainActivity.this,ResultActivity3.class);


                intent.putExtra("MUL",num1+" * "+num2+" = "+(num1*num2));
                startActivity(intent);

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                Intent intent = new Intent(MainActivity.this,ResultActivity4.class);


                intent.putExtra("DIV",num1+" / "+num2+" = "+(num1/num2));
                startActivity(intent);

            }
        });   

    }
}
