package com.example.tehtava10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String url;

    public ImageAdapter(Context context, String url){
        super(context,R.layout.activity_main);
        this.context = context;
        this.url = url;
        inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_main, parent, false);
        }

        Picasso
                .get()
                .load(url)
                .into((ImageView) convertView);

        return convertView;
    }
}
