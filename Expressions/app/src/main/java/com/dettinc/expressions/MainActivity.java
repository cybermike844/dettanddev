package com.dettinc.expressions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first we declare and initialize a few variables
        int a = 10;
        String b = "Alan Turing";
        boolean c = true;
        //let's look at how android sees them
        Log.i("info","a="+a);
        Log.i("info","b="+b);
        Log.i("info","c="+c);
        //now let's make some changes
        a++;
        a = a + 10;
        b = b + "was smarter than your average bear Booboo";
        b = b + a;
        c = (1+1==3);//1+1=2 so this should return false
        //let's look at how android sees them
        Log.i("info","a="+a);
        Log.i("info","b="+b);
        Log.i("info","c="+c);

    }
}
