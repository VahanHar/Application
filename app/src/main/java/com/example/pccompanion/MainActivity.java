package com.example.pccompanion;
import com.example.PCCompanion.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openComparisonActivity(View view) {
        Intent intent = new Intent(this, ComparisonActivity.class);
        startActivity(intent);
    }

    public void openConfigurationActivity(View view) {
        Intent intent = new Intent(this, ConfigurationActivity.class);
        startActivity(intent);
    }
}
