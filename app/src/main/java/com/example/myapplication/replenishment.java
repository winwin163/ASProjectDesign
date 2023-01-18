package com.example.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class replenishment extends AppCompatActivity {
    private DatePickerDialog dateDialog1;
    private DatePickerDialog dateDialog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.replenishment);

        Button button1 = (Button) findViewById(R.id.button1);
        // 通过Calendar对象来获取年、月、日、时、分的信息
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int monthOfYear = calendar.get(calendar.MONTH);
        int dayOfMonth = calendar.get(calendar.DAY_OF_MONTH);
        Button button2 = (Button) findViewById(R.id.button2);

        // 通过Calendar对象来获取年、月、日、时、分的信息
        calendar = Calendar.getInstance();
        int year1 = calendar.get(calendar.YEAR);
        int monthOfYear1 = calendar.get(calendar.MONTH);
        int dayOfMonth1 = calendar.get(calendar.DAY_OF_MONTH);

        EditText editText1 = (EditText) findViewById(R.id.edit1);
        EditText editText2 = (EditText) findViewById(R.id.edit2);
        dateDialog1 = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker arg0, int year, int monthOfYear,
                                  int dayOfMonth) {
                // 把获取的日期显示在文本框内，月份从0开始计数，所以要加1
                String text = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
                editText1.setText(text);
            }
        }, year, monthOfYear, dayOfMonth); // 后面的三个参数对应于上面的年、月、日

        dateDialog2 = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker arg0, int year1, int monthOfYear1,
                                  int dayOfMonth1) {
                // 把获取的日期显示在文本框内，月份从0开始计数，所以要加1
                String text = year1 + "-" + (monthOfYear1 + 1) + "-" + dayOfMonth1;
                editText2.setText(text);
            }
        }, year1, monthOfYear1, dayOfMonth1); // 后面的三个参数对应于上面的年、月、日
        /**
         * 对日期选择器按钮设置监听事件
         */
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // 点击日期选择器按钮时显示出日期对话框
                dateDialog1.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // 点击日期选择器按钮时显示出日期对话框
                dateDialog2.show();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(replenishment.this,Application.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(replenishment.this,feature.class);
                startActivity(intent);
            }
        });
    }

}
