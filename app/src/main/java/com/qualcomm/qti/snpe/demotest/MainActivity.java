package com.qualcomm.qti.snpe.demotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Properties properties =  PropertiesUtils.loadProperties(this);
        if(properties != null){
          String s = properties.getProperty("outputlayers");
          if(s != null){
              Log.i("s=======",s);
              String[] strarr = s.split(",");
              Log.i("strarr[0]",strarr[0]);
              Log.i("strarr[1]",strarr[1]);
          }
        }
    }
}
