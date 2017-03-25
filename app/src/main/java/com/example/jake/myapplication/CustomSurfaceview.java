package com.example.jake.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by Jake on 3/23/2017.
 */


public class CustomSurfaceview extends SurfaceView {
    CustomCircle C1;
    CustomCircle C2;
    CustomRect R1;
    CustomRect R2;
    CustomRect R3;
    CustomRect R4;


    public CustomSurfaceview(Context context, AttributeSet attrs) {
        super(context, attrs);
        R1 = new CustomRect("rect", Color.BLUE, 100,600, 400,900);

        R3 = new CustomRect("rect", Color.BLUE, 1100,600 , 1400,900);

        R2 = new CustomRect("rect", Color.GRAY, 400,400, 1100,900);

        R4 = new CustomRect("rect", Color.RED, 650,300, 850,400);

        C1 = new CustomCircle("circle", Color.BLACK, 1100, 900, 150) ;

        C2 = new CustomCircle("circle", Color.BLACK, 400, 900, 150) ;



    }

    @Override
    public void onDraw(Canvas c) {


        R1.drawMe(c);

        R2.drawMe(c);

        R3.drawMe(c);

        R4.drawMe(c);

        C1.drawMe(c);

        C2.drawMe(c);

        if(C2.containsPoint(CustomListener.x, CustomListener.y))
        {

            //highlight the circle
            //let the textview display the name
            //change the seekbars so that they show the color of the circle
            //what you do when C2 is tapped
        }

    }






}
