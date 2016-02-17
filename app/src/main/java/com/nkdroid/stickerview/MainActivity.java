package com.nkdroid.stickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout canvas = (FrameLayout) findViewById(R.id.canvasView);

//……

// add a stickerImage to canvas
        StickerImageView iv_sticker = new StickerImageView(MainActivity.this);
        iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.c10));
        canvas.addView(iv_sticker);

// add a stickerText to canvas
        StickerTextView tv_sticker = new StickerTextView(MainActivity.this);
        tv_sticker.setText("nkDroid");
        canvas.addView(tv_sticker);
    }
}
