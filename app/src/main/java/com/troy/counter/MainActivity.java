package com.troy.counter;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    long count = 0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =  findViewById(R.id.txtview);
        findViewById(R.id.addbtn).setOnClickListener(new MyEventHandler());
        findViewById(R.id.subbtn).setOnClickListener(new MyEventHandler());
        findViewById(R.id.resetbtn).setOnClickListener(new MyEventHandler());

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }

    public class MyEventHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.addbtn){
                count++;
            }
            else if(v.getId() == R.id.subbtn){
                if(count > 0) count--;
            }
            else if(v.getId() == R.id.resetbtn){
                count = 0;
            }
            text.setText(Long.toString(count));

        }
    }
}
