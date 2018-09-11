package com.example.gor.showcase.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gor.showcase.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

public class ItemActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewValue;
    ImageView logo;
    Button buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        setRequestedOrientation(SCREEN_ORIENTATION_PORTRAIT);
        Intent intent = getIntent();
        final ArrayList<String> s = intent.getStringArrayListExtra("data");

        textViewName = findViewById(R.id.offerName);
        textViewValue = findViewById(R.id.offerDesc_full);
        logo = findViewById(R.id.logo);
        buy = findViewById(R.id.buy);

        Picasso.get().load(s.get(0)).into(logo);
        textViewName.setText(s.get(1));
        textViewValue.setText(s.get(2));
        buy.setText(s.get(3));

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s.get(4)));
                startActivity(browserIntent);
            }
        });


    }
}
