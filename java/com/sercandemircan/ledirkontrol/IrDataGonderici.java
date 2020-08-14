package com.sercandemircan.ledirkontrol;


import android.content.Context;
import android.hardware.ConsumerIrManager;

public class IrDataGonderici{

    ConsumerIrManager cIr;

    IrDataGonderici(Context context){


        cIr = (ConsumerIrManager) context.getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    int frekans=38000;//bu, en uygun frekans ve standart bi frekans
    void gonder(int []data){


        int [] gonder_data=new int[data.length*2];

        for(int say=0;say<data.length;say++){

            gonder_data[(say*2)+0]=(data[say]*1000)+500;
            gonder_data[(say*2)+1]=255;
        }


        cIr.transmit(frekans, gonder_data);
    }



}