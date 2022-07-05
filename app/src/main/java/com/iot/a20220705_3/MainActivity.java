package com.iot.a20220705_3;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linearLayout = new LinearLayout(this);
        linearLayout.setGravity(Gravity.CENTER);
        TextView textView = new TextView(this);
        textView.setText("Hello World from Java!!!");
        textView.setTextSize((float) 28.0);
        textView.setTextColor(Color.argb(255,0,0,0));
        linearLayout.addView(textView);
        setContentView(linearLayout);
    }
}