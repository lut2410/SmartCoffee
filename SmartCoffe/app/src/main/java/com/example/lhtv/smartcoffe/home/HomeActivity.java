package com.example.lhtv.smartcoffe.home;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.lhtv.smartcoffe.Instance;
import com.example.lhtv.smartcoffe.LoginActivity;
import com.example.lhtv.smartcoffe.R;
import com.example.lhtv.smartcoffe.account.AccountActivity;
import com.example.lhtv.smartcoffe.category.CategoryActivity;
import com.example.lhtv.smartcoffe.module.Drink;
import com.example.lhtv.smartcoffe.module.DrinkCategory;
import com.example.lhtv.smartcoffe.module.Table;
import com.example.lhtv.smartcoffe.module.TableDrink;
import com.example.lhtv.smartcoffe.statistic.StatisticActivity;
import com.example.lhtv.smartcoffe.work.WorkActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_tabs)
    TabLayout tabLayout;
    @BindView(R.id.container)
    ViewPager viewPager;

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        // Add data

        addDrinkCategoryList();
        addDrinkList();
        addTableList();
        addTableDrinkList();

        addControl();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_tai_khoan:
                        startActivity(new Intent(HomeActivity.this, AccountActivity.class));
                        break;
                    case R.id.nav_danh_muc:
                        startActivity(new Intent(HomeActivity.this, CategoryActivity.class));
                        break;
                    case R.id.nav_nghiep_vu:
                        startActivity(new Intent(HomeActivity.this, WorkActivity.class));
                        break;
                    case R.id.nav_thong_ke:
                        startActivity(new Intent(HomeActivity.this, StatisticActivity.class));
                        break;
                    case R.id.nav_sign_out:
                        Instance.userType = -1;
                        startActivity(new Intent(HomeActivity.this,LoginActivity.class));
                        finish();
                        break;
                }
                return false;
            }
        });

        if(Instance.userType != 1){
            navigationView.setVisibility(View.GONE);
        }
    }

    private void addControl(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        HomePagerAdapter adapter = new HomePagerAdapter(fragmentManager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(0xff000000, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
    }



    private void addTableList(){
        Table table1 = new Table(1,"Bàn 1");
        Table table2 = new Table(2,"Bàn 2");
        Table table3 = new Table(3,"Bàn 3");
        Table table4 = new Table(4,"Bàn 4");
        Table table5 = new Table(5,"Bàn 5");
        Table table6 = new Table(6,"Bàn 6");
        Table table7 = new Table(7,"Bàn 7");
        Table table8 = new Table(8,"Bàn 8");
        Table table9 = new Table(9,"Bàn 9");
        Table table10 = new Table(10,"Bàn 10");

        Instance.tableList.add(table1);
        Instance.tableList.add(table2);
        Instance.tableList.add(table3);
        Instance.tableList.add(table4);
        Instance.tableList.add(table5);
        Instance.tableList.add(table6);
        Instance.tableList.add(table7);
        Instance.tableList.add(table8);
        Instance.tableList.add(table9);
        Instance.tableList.add(table10);
    }
    private void addDrinkCategoryList(){
        DrinkCategory drinkCategory1 = new DrinkCategory(1,"Cafe");
        DrinkCategory drinkCategory2 = new DrinkCategory(2,"Nước giải khát");
        DrinkCategory drinkCategory3 = new DrinkCategory(3,"Sinh tố");

        Instance.drinkCategoryList.add(drinkCategory1);
        Instance.drinkCategoryList.add(drinkCategory2);
        Instance.drinkCategoryList.add(drinkCategory3);
    }
    private void addDrinkList(){
        Drink drink1 = new Drink(1,1,12000.00,"Cafe đá");
        Drink drink2 = new Drink(2,1,15000.00,"Cafe sữa");
        Drink drink3 = new Drink(3,2,15000.00,"Sting");
        Drink drink4 = new Drink(4,2,15000.00,"Number One");
        Drink drink5 = new Drink(5,3,15000.00,"Sinh tố Dâu");
        Drink drink6 = new Drink(6,3,15000.00,"Sinh tố Dừa");

        Instance.drinkList.add(drink1);
        Instance.drinkList.add(drink2);
        Instance.drinkList.add(drink3);
        Instance.drinkList.add(drink4);
        Instance.drinkList.add(drink5);
        Instance.drinkList.add(drink6);
    }

    private void addTableDrinkList(){
        TableDrink tableDrink1 = new TableDrink(1,0,"Bàn 1",0);
        TableDrink tableDrink2 = new TableDrink(2,0,"Bàn 2",0);
        TableDrink tableDrink3 = new TableDrink(3,0,"Bàn 3",0);
        TableDrink tableDrink4 = new TableDrink(4,0,"Bàn 4",0);
        TableDrink tableDrink5 = new TableDrink(5,0,"Bàn 5",0);
        TableDrink tableDrink6 = new TableDrink(6,0,"Bàn 6",0);
        TableDrink tableDrink7 = new TableDrink(7,0,"Bàn 7",0);
        TableDrink tableDrink8 = new TableDrink(8,0,"Bàn 8",0);
        TableDrink tableDrink9 = new TableDrink(9,0,"Bàn 9",0);
        TableDrink tableDrink10 = new TableDrink(10,0,"Bàn 10",0);
        TableDrink tableDrink11 = new TableDrink(11,0,"Bàn 11",0);
        TableDrink tableDrink12 = new TableDrink(12,0,"Bàn 12",0);

        Instance.tableDrinkList.add(tableDrink1);
        Instance.tableDrinkList.add(tableDrink2);
        Instance.tableDrinkList.add(tableDrink3);
        Instance.tableDrinkList.add(tableDrink4);
        Instance.tableDrinkList.add(tableDrink5);
        Instance.tableDrinkList.add(tableDrink6);
        Instance.tableDrinkList.add(tableDrink7);
        Instance.tableDrinkList.add(tableDrink8);
        Instance.tableDrinkList.add(tableDrink9);
        Instance.tableDrinkList.add(tableDrink10);
        Instance.tableDrinkList.add(tableDrink11);
        Instance.tableDrinkList.add(tableDrink12);
    }
}
