package com.example.tehtava10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    EditText et;
    TextView tv;
    ListView lv;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        lv = findViewById(R.id.lv);
        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);
        iv = findViewById(R.id.iv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = et.getText().toString() + ", ";
                tv.append(x);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = tv.getText().toString();
                String url = "https://loremflickr.com/320/240/" + x;
               // lv.setAdapter(new ImageAdapter(MainActivity.this, url));
                Picasso.get().load(url).into(iv);
            }
        });

    }
}


