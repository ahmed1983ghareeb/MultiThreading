package com.ghareeb.multithreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stop(View view){
        //Main thread is UI thread



    }

    public void start(View view){
    //seperate thread
        FootThread footThread  = new FootThread();
        footThread.start();
    }

    //this class is going to extend thread

    class FootThread extends Thread{
        @Override
        public void run() {
            super.run();

            for(int i = 0; i< 20 ; i++){
                try{
                    Log.i("MainActivity", "starting thread: "+ i);
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
