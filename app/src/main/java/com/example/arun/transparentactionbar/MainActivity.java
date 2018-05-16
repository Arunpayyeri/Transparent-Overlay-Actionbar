package com.example.arun.transparentactionbar;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        if(bar!=null){
            TextView tv = new TextView(getApplicationContext());
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setLayoutParams(lp);

            tv.setText(bar.getTitle());
            tv.setGravity(Gravity.LEFT);
            tv.setTextColor(Color.WHITE);

//            Typeface custom_font = Typeface.createFromAsset(getAssets(),  "Ubuntu-B.ttf");

           // tv.setTypeface(custom_font);

            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
            bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            bar.setCustomView(tv);


        }
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setElevation(0);
    }
}
