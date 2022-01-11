package ru.azanova.KPIris;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
    }

    public void onClickRead(View view) {
        Intent r = new Intent(StartActivity.this, ReadActivity.class);
        startActivity(r);

    }


    public void onClickNew(View view)
    {
        Intent i = new Intent(StartActivity.this, MainActivity.class);
        startActivity(i);

    }

    public void onClickCalc(View view)
    {
        Intent i = new Intent(StartActivity.this, ReadActivity.class);
        startActivity(i);
        //Toast.makeText(this, "Раздел в разработке", Toast.LENGTH_SHORT).show();

    }
}