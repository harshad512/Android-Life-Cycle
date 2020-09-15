package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"On Create",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"On Start",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"On Resume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"On Pause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"On Restart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"On Destory",Toast.LENGTH_LONG).show();
    }

}
