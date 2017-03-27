package com.example.cisadmin06.leeeeaaavvveee;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        OnClickListener listnr=new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(i);
            }
        };
        Button btn =(Button) findViewById(R.id.button1);
        btn.setOnClickListener(listnr);

        OnClickListener listner=new OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent j= new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(j);
            }
        };
        Button btn1 =(Button) findViewById(R.id.button2);
        btn1.setOnClickListener(listner);

        OnClickListener listner2=new OnClickListener() {
            @Override
            public void onClick(View vie) {
                Intent k= new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(k);
            }
        };
        Button btn2 =(Button) findViewById(R.id.button3);
        btn2.setOnClickListener(listner2);

    }
}