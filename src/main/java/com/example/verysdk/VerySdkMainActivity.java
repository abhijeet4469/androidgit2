package com.example.verysdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VerySdkMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_verysdk);


        // sample comment to check for submodule commit

        TextView textId = findViewById(R.id.textId);
        // sample commit from another project og Git replica
    }
}