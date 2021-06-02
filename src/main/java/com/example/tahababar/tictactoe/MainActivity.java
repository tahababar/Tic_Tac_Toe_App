package com.example.tahababar.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int imageCount = 1;

    public void dropIn(View view)
    {
       if ((imageCount % 2 == 0) && (imageCount < 10)) {
            ImageView image = (ImageView) view;
            image.setImageResource(R.drawable.yellow);
            image.setAlpha(0.8f);
            Log.i("Yellow", "ImageCount"+ imageCount);
            imageCount++;
        }
        else if (imageCount < 10)
        {
            ImageView image = (ImageView) view;
            image.setAlpha(1);
            Log.i("Red", "ImageCount"+ imageCount);
            imageCount++;
        }
        else if (imageCount == 10){
            ImageView image1 = findViewById(R.id.image1);
            ImageView image2 = findViewById(R.id.image2);
            ImageView image3 = findViewById(R.id.image3);
            ImageView image4 = findViewById(R.id.image4);
            ImageView image5 = findViewById(R.id.image5);
            ImageView image6 = findViewById(R.id.image6);
            ImageView image7 = findViewById(R.id.image7);
            ImageView image8 = findViewById(R.id.image8);
            ImageView image9 = findViewById(R.id.image9);
            if (image1.getAlpha() == 0.8f && image2.getAlpha() == 0.8f && image3.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image4.getAlpha() == 0.8f && image5.getAlpha() == 0.8f && image6.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image7.getAlpha() == 0.8f && image8.getAlpha() == 0.8f && image9.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image1.getAlpha() == 0.8f && image4.getAlpha() == 0.8f && image7.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image2.getAlpha() == 0.8f && image5.getAlpha() == 0.8f && image8.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image3.getAlpha() == 0.8f && image6.getAlpha() == 0.8f && image9.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image1.getAlpha() == 0.8f && image5.getAlpha() == 0.8f && image9.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image3.getAlpha() == 0.8f && image5.getAlpha() == 0.8f && image7.getAlpha() == 0.8f) {
                TextView result = findViewById(R.id.textView2);
                String x = "Yellow wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image1.getAlpha() == 1 && image2.getAlpha() == 1 && image3.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image4.getAlpha() == 1 && image5.getAlpha() == 1 && image6.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image7.getAlpha() == 1 && image8.getAlpha() == 1 && image9.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image1.getAlpha() == 1 && image4.getAlpha() == 1 && image7.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image2.getAlpha() == 1 && image5.getAlpha() == 1 && image8.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image3.getAlpha() == 1 && image6.getAlpha() == 1 && image9.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image1.getAlpha() == 1 && image5.getAlpha() == 1 && image9.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            } else if (image3.getAlpha() == 1 && image5.getAlpha() == 1 && image7.getAlpha() == 1) {
                TextView result = findViewById(R.id.textView2);
                String x = "Red wins!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            }
            else
            {
                TextView result = findViewById(R.id.textView2);
                String x = "Draw!";
                result.getText().toString().equals(x);
                result.setAlpha(1);
            }

        }
    }

    public void reset(View view)
    {
        TextView result = findViewById(R.id.textView2);
        result.setAlpha(0);
        imageCount = 1;
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i < 9; i++)
        {
            ImageView image = (ImageView) gridLayout.getChildAt(i);
            image.setImageResource(R.drawable.red);
            image.setAlpha(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}




//use grid layout with row count and column count and set background image as board