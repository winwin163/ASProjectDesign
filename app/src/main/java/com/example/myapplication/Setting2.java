package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Setting2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这个是获取布局文件的，这里是你下一个页面的布局文件
        // 注意这个是跳转界面的不能设置错，应该是第一个
        setContentView(R.layout.setting2);
        Button button1 = (Button) findViewById(R.id.qita1);
        //按钮进行监听
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(Setting2.this,Setting1.class);
                startActivity(intent);
            }
        });
    }
}
