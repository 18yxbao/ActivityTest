package com.byx.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static final String TAG="nate";
    private Button button;

    @Override
    protected void onStart() {
        Log.i(TAG,"SecondActivity onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG,"SecondActivity onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG,"SecondActivity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"SecondActivity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"SecondActivity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"SecondActivity onDestroy");
        super.onDestroy();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Log.i(TAG,"SecondActivity onCreat");
//        button=(Button)findViewById(R.id.button);
//        button.setOnClickListener(this);
    }
}
