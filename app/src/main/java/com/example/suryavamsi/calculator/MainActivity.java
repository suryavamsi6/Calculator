package com.example.suryavamsi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
EditText edt;
Button add,subtract,multiply,divide,but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,butc,buteq,butdec;
boolean addition,subtraction,division,multiplication;
float num1,num2,result_num;
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        edt = (EditText)findViewById(R.id.edt);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);
        but3 = (Button)findViewById(R.id.but3);
        but4 = (Button)findViewById(R.id.but4);
        but5 = (Button)findViewById(R.id.but5);
        but6 = (Button)findViewById(R.id.but6);
        but7 = (Button)findViewById(R.id.but7);
        but8 = (Button)findViewById(R.id.but8);
        but9 = (Button)findViewById(R.id.but9);
        but0 = (Button)findViewById(R.id.but0);
        buteq = (Button)findViewById(R.id.buteq);
        butc = (Button)findViewById(R.id.butc);
        butdec = (Button)findViewById(R.id.butdec);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "1";
                edt.setText(text);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "2";
                edt.setText(text);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "3";
                edt.setText(text);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "4";
                edt.setText(text);
            }

        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "5";
                edt.setText(text);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "6";
                edt.setText(text);
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "7";
                edt.setText(text);
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "8";
                edt.setText(text);
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + "9";
                edt.setText(text);
            }
        });
        butdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = String.valueOf(edt.getText());
                text+= text + ".";
                edt.setText(text);
            }
        });
        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
                result.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt == null)
                 result.setText("");
                else{
                    num1 = Float.parseFloat(edt.getText() + "");
                    addition=true;
                    edt.setText(null);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt == null)
                    result.setText("");
                else {
                    num1 = Float.parseFloat(edt.getText() + "");
                    multiplication = true;
                    edt.setText(null);
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {


                    if(edt == null)
                        result.setText("");
                    else {
                        num1 = Float.parseFloat(edt.getText() + "");
                        subtraction = true;
                        edt.setText(null);
                    }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt == null)
                    result.setText("");
                else {
                    num1 = Float.parseFloat(edt.getText() + "");
                    division = true;
                    edt.setText(null);
                }
            }
        });
        buteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(edt.getText() + "");

                if (addition){
                    result_num = num1 + num2;
                    result.setText(String.valueOf(result_num));
                    addition = false;
                }


                if (subtraction){
                    result_num = num1 - num2;
                    result.setText(String.valueOf(result_num));
                    subtraction = false;
                }

                if (multiplication){
                    result_num = num1 * num2;
                    result.setText(String.valueOf(result_num));
                    multiplication = false;
                }

                if (division){
                    result_num = num1 / num2;
                    result.setText(String.valueOf(result_num));
                    division = false;
                }
            }
        });
    }
}
