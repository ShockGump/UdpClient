package com.amos.udpclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask2 myTask2 = new MyAsyncTask2();
        myTask2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR,10);
        Log.d(TAG,"after myTask2");
        MyAsyncTask myTask = new MyAsyncTask();
        myTask.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR,10);
        MyAsyncTask myTask3 = new MyAsyncTask();
        myTask3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,5);
        Log.d(TAG,"after myTask");

    }
}
