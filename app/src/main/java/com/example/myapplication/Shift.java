package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Shift extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shift);

        //————点钞功能计算器————
    EditText Edit1 = (EditText) findViewById(R.id.edit1);
    EditText Edit2 = (EditText) findViewById(R.id.edit2);
    EditText Edit3 = (EditText) findViewById(R.id.edit3);
    EditText Edit4 = (EditText) findViewById(R.id.edit4);
    //文本框进行监听
    /*class addListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            //获取Editext 控件中输入的值
            double number1=Double.parseDouble(Edit1.getText().toString());
            double number2=Double.parseDouble(Edit2.getText().toString());
            double number=number1-number2;
            Edit3.setText(""+number);
            Edit4.setText(""+number);
        }
    }*/
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        //按钮进行监听
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //获取Editext 控件中输入的值
                double number1 = Double.parseDouble(Edit1.getText().toString());
                double number2 = Double.parseDouble(Edit2.getText().toString());
                double number = number1 - number2;
                Edit3.setText("" + number);
                Edit4.setText("" + number);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        //按钮进行监听
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(Shift.this,shifttest.class);
                startActivity(intent);
            }
        });

        //按钮进行监听
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(Shift.this,feature.class);
                startActivity(intent);
            }
        });
    }
}

