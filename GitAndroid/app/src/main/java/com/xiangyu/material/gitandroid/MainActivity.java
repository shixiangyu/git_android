package com.xiangyu.material.gitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.git).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //log标志
                Log.d("shixiangyu","git");

            }
        });
    }

    private void test(){
        //添加test方法
    }

    private void sum(){
        
    }
}
