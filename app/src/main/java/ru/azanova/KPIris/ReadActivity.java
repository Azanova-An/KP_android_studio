package ru.azanova.KPIris;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ReadActivity extends AppCompatActivity {
    private ListView listView;
    //private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> listData;
    private List<product> listTemp;
    private DatabaseReference mDataBase;
    private String PRODUCT_KEY ="product";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_layout);
        init();
        getDataFromDB();
        setOnclickItem();
    }
    private void init()
    {
        listView = findViewById(R.id.listView);
        listData = new ArrayList<>();
        listTemp = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);
        mDataBase= FirebaseDatabase.getInstance().getReference(PRODUCT_KEY);
    }
    private void getDataFromDB()
    {
        ValueEventListener vListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (listData.size()>0) listData.clear();
                if (listTemp.size()>0) listTemp.clear();
                for (DataSnapshot ds : snapshot.getChildren())
                {
                    product product = ds.getValue(ru.azanova.KPIris.product.class);
                    assert product !=null;
                    listData.add(product.name);
                    listTemp.add(product);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };

        mDataBase.addValueEventListener(vListener);
    }
    private void setOnclickItem()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                product product = listTemp.get(position);
                Intent i = new Intent(ReadActivity.this, ShowActivity.class);
                i.putExtra(Constant.PRODUCT_NAME, product.name);
                i.putExtra(Constant.PRODUCT_TIME_OVER, product.timeOver);
                i.putExtra(Constant.PRODUCT_TIME_UNI, product.timeUni);
                i.putExtra(Constant.PRODUCT_TIME_PLOS, product.timePlos);
                startActivity(i);
            }
        });
    }
}
