package com.example.administrator.zzudangdang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.zzudangdang.booklist.BookList_Activity;
import com.example.administrator.zzudangdang.dd01.dd01;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 测试用活动跳转，下面的两行等待删除
        Intent intent = new Intent(this, dd01.class);
        startActivity(intent);
    }
}
