package ru.azanova.KPIris;

import static ru.azanova.KPIris.R.layout.read_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText edName, edOver, edUni, edPlos;
    private DatabaseReference mDataBase;
    private String PRODUCT_KEY ="product";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private void init()
    {
        edName=findViewById(R.id.edName);
        edOver=findViewById(R.id.edOver);
        edUni=findViewById(R.id.edUni);
        edPlos=findViewById(R.id.edPlos);
        mDataBase= FirebaseDatabase.getInstance().getReference(PRODUCT_KEY);
    }
    public void onClickSave (View view)
    {
        String id = mDataBase.getKey();
        String name = edName.getText().toString();
        String timeOver = edOver.getText().toString();
        String timeUni = edUni.getText().toString();
        String timePlos = edPlos.getText().toString();
        product newproduct = new product(id, name, timeOver, timeUni, timePlos);
        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(timeOver)&& !TextUtils.isEmpty(timeUni)&& !TextUtils.isEmpty(timePlos))
        {
        mDataBase.push().setValue(newproduct);
            Toast.makeText(this, "Успешно", Toast.LENGTH_SHORT).show();
            edName.getText().clear();
            edOver.getText().clear();
            edUni.getText().clear();
            edPlos.getText().clear();
        }
        else {
            Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickBack (View view)
    {
        Intent i = new Intent(MainActivity.this, StartActivity.class);
        startActivity(i);

    }
    public void onClickTest (View view)
    {
       Intent i = new Intent(MainActivity.this,ReadActivity.class);
            startActivity(i);

        }

    }

