package com.ankitkumar.imagetoggleusingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int k=1;
    public void changeImage(View view) {
        ImageView im = (ImageView) findViewById(R.id.im1);
        if (k == 1) {
            im.setImageResource(R.drawable.kkk);
            k = 2;
        }
        else {
            im.setImageResource(R.drawable.aaa);
            k=1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
