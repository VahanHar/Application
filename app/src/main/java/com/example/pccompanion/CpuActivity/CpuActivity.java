package com.example.pccompanion.CpuActivity;
import com.example.PCCompanion.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class CpuActivity extends AppCompatActivity {

        private Button Intel;
        private Button Amd;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cpu);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // enable back button

            // Find buttons by ID and set onClickListeners for each
            Intel = findViewById(R.id.Intel_button);
            Amd = findViewById(R.id.Amd_button);


            Intel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(CpuActivity.this, com.example.pccompanion.CpuActivity.IntelActivity.class));
                }
            });
            Amd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(CpuActivity.this, AmdActivity.class));
                }
            });
        }
            // Handle back button press
            @Override
            public boolean onOptionsItemSelected (MenuItem item){
                int id = item.getItemId();

                if (id == android.R.id.home) {
                    onBackPressed();
                    return true;
                }

                return super.onOptionsItemSelected(item);

        }


}
