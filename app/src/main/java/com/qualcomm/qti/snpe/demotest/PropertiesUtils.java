package com.qualcomm.qti.snpe.demotest;

import android.content.Context;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties loadProperties(Context context) {
        Properties properties = new Properties();
        try {
            InputStream in = context.getAssets().open("twa.Properties");
            properties.load(in);
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return properties;
    }
}