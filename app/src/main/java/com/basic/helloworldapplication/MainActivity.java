package com.basic.helloworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showImage(View view)
    {
        ImageView img = findViewById(R.id.img1);
        img.setImageResource(R.drawable.hello_world);
    }

    public void showText(View view)
    {
        TextView txt = findViewById(R.id.txtbox);
        txt.setText("\"Hello World\"");
    }

}