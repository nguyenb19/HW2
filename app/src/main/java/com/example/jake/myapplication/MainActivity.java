package com.example.jake.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;



public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    public static int x;
    public static int y;
    public static TextView myText;
    public static SeekBar SeekbarRed, SeekbarBlue, SeekbarGreen;


    CustomSurfaceview DrawSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting references to views on the GUI
        DrawSurface = (CustomSurfaceview)findViewById(R.id.surface1);
        myText = (TextView)findViewById(R.id.textView7);
        SeekbarRed = (SeekBar)findViewById(R.id.seekBar8);
        SeekbarBlue = (SeekBar)findViewById(R.id.seekBar9);
        SeekbarGreen = (SeekBar)findViewById(R.id.seekBar10);


        //registering listeners
        DrawSurface.setOnTouchListener(this);
        SeekbarBlue.setOnSeekBarChangeListener(this);
        SeekbarRed.setOnSeekBarChangeListener(this);
        SeekbarGreen.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int CustomColor = 0;



        if(seekBar.getId() == SeekbarRed.getId()) {
            CustomColor = Color.rgb(seekBar.getProgress(), Color.green(CustomSurfaceview.CustomStore.getColor()), Color.blue(CustomSurfaceview.CustomStore.getColor()));
        }
        else if(seekBar.getId() == SeekbarGreen.getId()) {
            CustomColor = Color.rgb(Color.red(CustomSurfaceview.CustomStore.getColor()), seekBar.getProgress(), Color.blue(CustomSurfaceview.CustomStore.getColor()));
        }
        else if(seekBar.getId() == SeekbarBlue.getId()) {
            CustomColor = Color.rgb(Color.red(CustomSurfaceview.CustomStore.getColor()),Color.green(CustomSurfaceview.CustomStore.getColor()), seekBar.getProgress() );

        }

        //CustomColor = Color.rgb(SeekbarRed.getProgress(),SeekbarGreen.getProgress(),SeekbarBlue.getProgress());
        CustomSurfaceview.CustomStore.setColor(CustomColor);



        DrawSurface.invalidate();
        return;



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if(event.getAction() != MotionEvent.ACTION_UP)
            return true;

        x = (int)event.getX();
        y = (int)event.getY();

        if(CustomSurfaceview.R3.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.R3;
            MainActivity.myText.setText(CustomSurfaceview.R3.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }
        else if(CustomSurfaceview.R2.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.R2;
            MainActivity.myText.setText(CustomSurfaceview.R2.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }
        else if(CustomSurfaceview.R1.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.R1;
            MainActivity.myText.setText(CustomSurfaceview.R1.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }
        else if(CustomSurfaceview.C2.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.C2;
            MainActivity.myText.setText(CustomSurfaceview.C2.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }
        else if(CustomSurfaceview.C1.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.C1;
            MainActivity.myText.setText(CustomSurfaceview.C1.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }
        else if(CustomSurfaceview.C1.containsPoint(x,y))
        {  //
            CustomSurfaceview.CustomStore = CustomSurfaceview.C1;
            MainActivity.myText.setText(CustomSurfaceview.C1.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));
            //make a comment

        }
        else if(CustomSurfaceview.R4.containsPoint(x,y))
        {
            CustomSurfaceview.CustomStore = CustomSurfaceview.R4;
            MainActivity.myText.setText(CustomSurfaceview.R4.getName());
            MainActivity.SeekbarBlue.setProgress(Color.blue(CustomSurfaceview.CustomStore.getColor())); //get blue part (much much blue on this part) and change the seekbar
            MainActivity.SeekbarGreen.setProgress(Color.green(CustomSurfaceview.CustomStore.getColor()));
            MainActivity.SeekbarRed.setProgress(Color.red(CustomSurfaceview.CustomStore.getColor()));

        }

        DrawSurface.invalidate();
        return false;




    }


}





