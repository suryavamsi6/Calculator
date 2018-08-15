package com.example.suryavamsi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
EditText number1,number2;
Button add,subtract,multiply,divide;
float num1,num2,result_num;
String input1,input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1=number1.getText().toString();
                input2=number2.getText().toString();
                if(input1.isEmpty())
                    num1=0;
                if(input2.isEmpty())
                    num2=0;
                else{
                num1 = Float.parseFloat(input1);
                num2 = Float.parseFloat(input2);}
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1=number1.getText().toString();
                input2=number2.getText().toString();
                if(input1.isEmpty())
                    num1=0;
                if(input2.isEmpty())
                    num2=0;
                else{
                num1 = Float.parseFloat(input1);
                num2 = Float.parseFloat(input2);}
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1,input2;
                input1=number1.getText().toString();
                input2=number2.getText().toString();
                if(input1.isEmpty())
                    num1=0;
                if(input2.isEmpty())
                    num2=0;
                else{
                num1 = Float.parseFloat(input1);
                num2 = Float.parseFloat(input2);}
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1=number1.getText().toString();
                input2=number2.getText().toString();
                if(input1.isEmpty())
                    num1=0;
                if(input2.isEmpty())
                    num2=0;
                else{
                num1 = Float.parseFloat(input1);
                num2 = Float.parseFloat(input2);}
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));

            }
        });
    }
}
