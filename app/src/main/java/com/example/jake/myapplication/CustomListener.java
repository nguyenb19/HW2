package com.example.jake.myapplication;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Jake on 3/24/2017.
 */



public class CustomListener implements View.OnTouchListener {

    public static int x;
    public static int y;





    public boolean onTouch(View v, MotionEvent event) {
        x = (int)event.getX();
        y = (int)event.getY();




        return false;
    }
}

