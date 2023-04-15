package com.example.pcplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcplanner.CpuActivity.CpuActivity;

public class ConfigurationActivity extends AppCompatActivity {

    private Button saveButton;
    private Button cpuButton;
    private Button gpuButton;
    private Button ramButton;
    private Button motherboardButton;
    private Button psuButton;
    private Button storageButton;
    private Button coolerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // enable back button

        // Find buttons by ID and set onClickListeners for each
        cpuButton = findViewById(R.id.cpu_button);
        gpuButton = findViewById(R.id.gpu_button);
        ramButton = findViewById(R.id.ram_button);
        motherboardButton = findViewById(R.id.motherboard_button);
        psuButton = findViewById(R.id.psu_button);
        storageButton = findViewById(R.id.storage_button);
        coolerButton = findViewById(R.id.cooler_button);
        saveButton = findViewById(R.id.save_button);

        cpuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, CpuActivity.class));
            }
        });

        gpuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, GpuActivity.class));
            }
        });

        ramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, RamActivity.class));
            }
        });

        motherboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, MotherboardActivity.class));
            }
        });

        psuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, PsuActivity.class));
            }
        });

        storageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, StorageActivity.class));
            }
        });

        coolerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfigurationActivity.this, CoolerActivity.class));
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Save configuration logic here
                Toast.makeText(ConfigurationActivity.this, "Configuration saved!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Handle back button press
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
