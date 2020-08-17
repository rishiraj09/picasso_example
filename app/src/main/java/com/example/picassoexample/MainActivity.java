package com.example.picassoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_view);

        String url = "https://images.unsplash.com/photo-1504639725590-34d0984388bd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80";
        Picasso.get()
                .load(url)
//                .resize(0, 500)
//                .resizeDimen(R.dimen.image_size, R.dimen.image_size)
//                .onlyScaleDown()
//                .fit()
//                .centerInside()
                .into(imageView);
    }
}