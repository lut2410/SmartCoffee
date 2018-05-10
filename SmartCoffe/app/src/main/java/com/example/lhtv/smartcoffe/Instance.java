package com.example.lhtv.smartcoffe;

import com.example.lhtv.smartcoffe.module.Drink;
import com.example.lhtv.smartcoffe.module.DrinkCategory;
import com.example.lhtv.smartcoffe.module.Table;
import com.example.lhtv.smartcoffe.module.TableDrink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LHTV on 3/13/2018.
 */

public class Instance {
    public static int userType = -1;
    public static List<Table> tableList = new ArrayList<>();
    public static List<DrinkCategory> drinkCategoryList = new ArrayList<>();
    public static List<Drink> drinkList = new ArrayList<>();
    public static List<TableDrink> tableDrinkList = new ArrayList<>();
    public static TableDrink tableDrinkItemSelected = null;
}
