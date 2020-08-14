package com.sercandemircan.ledirkontrol;

import android.app.Activity;
import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView tv;

    IrDataGonderici dataGonderici;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText("7");

        dataGonderici=new IrDataGonderici(this);


          }



    public void tikla(View view){

        dataGonderici.gonder(new int[]{1,2,3,4,5,6,7,8,9,10});




    }





}
