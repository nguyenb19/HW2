package com.example.jake.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by Jake on 3/23/2017.
 */

public class CustomSurfaceview extends SurfaceView{

    public CustomSurfaceview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas c) {

        CustomCircle C1 = new CustomCircle("circle", Color.YELLOW, 1000, 1000, 200) ;
        C1.drawMe(c);

        CustomCircle C2 = new CustomCircle("circle", Color.YELLOW, 700, 700, 200) ;
        C2.drawMe(c);

        CustomCircle C3 = new CustomCircle("circle", Color.YELLOW, 500, 100, 200) ;
        C3.drawMe(c);

        CustomRect R1 = new CustomRect("rect", Color.GREEN, 100,100, 400,500);
        R1.drawMe(c);

        CustomRect R2 = new CustomRect("rect", Color.GREEN, 1050,100, 1400,500);
        R2.drawMe(c);


    }






}
