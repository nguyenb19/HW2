package com.example.jake.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.TextView;

/**
 * Created by Jake on 3/23/2017.
 */


public class CustomSurfaceview extends SurfaceView {
    public static CustomElement CustomStore = null;
    public static CustomCircle C1;
    public static CustomCircle C2;
    public static CustomRect R1;
    public static CustomRect R2;
    public static CustomRect R3;
    public static CustomRect R4;


    public CustomSurfaceview(Context context, AttributeSet attrs) {
        super(context, attrs);
        R1 = new CustomRect("Left Side", Color.BLUE, 100,600, 400,900);

        R3 = new CustomRect("Right Side", Color.BLUE, 1100,600 , 1400,900);

        R2 = new CustomRect("Body Car", Color.BLACK, 400,400, 1100,900);

        R4 = new CustomRect("Top Car", Color.RED, 650,300, 850,400);

        C1 = new CustomCircle("Wheel_1", Color.BLACK, 1100, 900, 150) ;

        C2 = new CustomCircle("Wheel_2", Color.BLACK, 400, 900, 150) ;



    }

    @Override
    public void onDraw(Canvas c) {


        CustomElement temp = CustomStore;

        R1.drawMe(c);

        R2.drawMe(c);

        R3.drawMe(c);

        R4.drawMe(c);

        C1.drawMe(c);

        C2.drawMe(c);


        if(CustomStore != null) {
            CustomStore.drawHighlight(c);
        }















    }






}
