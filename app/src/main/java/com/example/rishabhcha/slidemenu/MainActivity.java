package com.example.rishabhcha.slidemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.navdrawer.SimpleSideDrawer;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    SimpleSideDrawer slide_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        slide_me = new SimpleSideDrawer(this);
        slide_me.setRightBehindContentView(R.layout.activity_main2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slide_me.toggleRightDrawer();

            }
        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2.setBackgroundColor(Color.GREEN);

            }
        });

    }
}
