package com.example.lhtv.smartcoffe.home.add_bill_info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.home.SEORecyclerViewAdapter;
import com.example.lhtv.smartcoffe.home.TableSEOActivity;
import com.example.lhtv.smartcoffe.module.Drink;
import com.example.lhtv.smartcoffe.module.TableDrink;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddBillInfoActivity extends AppCompatActivity {
    private GridLayoutManager gridLayoutManager;
    @BindView(R.id.recyclerView_add_bill_info)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill_info);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddBillInfoActivity.this, TableSEOActivity.class));
                finish();
            }
        });

        gridLayoutManager = new GridLayoutManager(this,3);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);

        AddBillInfoAdapter adapter = new AddBillInfoAdapter(Instance.drinkList,this, new AddBillInfoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Drink item) {
                Toast.makeText(AddBillInfoActivity.this, ""+item.name, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
