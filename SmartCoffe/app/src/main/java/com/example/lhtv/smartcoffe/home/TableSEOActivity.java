package com.example.lhtv.smartcoffe.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.home.add_bill_info.AddBillInfoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TableSEOActivity extends AppCompatActivity {

    @BindView(R.id.btn_add_bill_info) Button mBtnAddBillInfo;
    @BindView(R.id.btn_delete_bill_info) Button mBtnDeleteBillInfo;
    @BindView(R.id.btn_print_bill) Button mBtnPrintBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_seo);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableSEOActivity.this, HomeActivity.class));
                finish();
            }
        });
        Toast.makeText(this, ""+ Instance.tableDrinkItemSelected.name, Toast.LENGTH_SHORT).show();
        mBtnAddBillInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TableSEOActivity.this,AddBillInfoActivity.class));
                finish();
            }
        });
    }
}
