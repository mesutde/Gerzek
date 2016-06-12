package com.dnkilic.gerzek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*İçerik girdilerini assets dosyasında adınıza
    açılan dosyaya alt alta ekleyiniz.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("deneme","deneme");
        Log.i("Doğan", "Kılıç");
    }
}
