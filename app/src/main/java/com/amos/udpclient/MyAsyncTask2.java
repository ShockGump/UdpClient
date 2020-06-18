package com.amos.udpclient;

import android.os.AsyncTask;
import android.util.Log;

public class MyAsyncTask2 extends AsyncTask<Integer,Integer,Void>
{
    String TAG="MyAsyncTask2";
    //该方法不运行在UI线程中,主要用于异步操作,通过调用publishProgress()方法
    //触发onProgressUpdate对UI进行操作
    @Override
    protected Void doInBackground(Integer... params) {
        DelayOperator dop = new DelayOperator();
        int i;
        while(true) {
            for (i = 1; i <=params[0]; i += 1) {
                Log.d(TAG, "doInBackground:  delay   " + String.valueOf(i));
                dop.delay();
            }
        }
    }
}
