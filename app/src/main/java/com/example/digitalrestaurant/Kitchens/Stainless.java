package com.example.digitalrestaurant.Kitchens;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalrestaurant.Adaptors.PopulateKitchensWithItemsAdaptor;
import com.example.digitalrestaurant.Authentications.LoginPage;
import com.example.digitalrestaurant.Database.DatabaseHelper;
import com.example.digitalrestaurant.HomePage;
import com.example.digitalrestaurant.Menu;
import com.example.digitalrestaurant.Order;
import com.example.digitalrestaurant.AdminPage;
import com.example.digitalrestaurant.R;
import com.example.digitalrestaurant.Details.ItemData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Stainless extends AppCompatActivity {


    private PopulateKitchensWithItemsAdaptor.RestaurantsRecyclerViewListener adalistener2;

    RecyclerView.Adapter stainlessAdaptor;

    RecyclerView stainlessRecycler;

    private List<ItemData> stainlessItems;

    FloatingActionButton floater;

    TextView homeKey,menuKey;

    private DatabaseHelper helper;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stainless_restaurant_homepage2);

        stainlessItems=new ArrayList<ItemData>();
        floater=findViewById(R.id.floatingActionButton);
        homeKey=(TextView) findViewById(R.id.homeKey);
        menuKey=findViewById(R.id.menuKeyS);

        Toast.makeText(this, "Make your choice\n scrolling food items\nvertically", Toast.LENGTH_SHORT).show();


        helper=new DatabaseHelper(this);

        makeAdaRestaurantAdaptor();
        gotoBasket();
        homeKey();
        menuKey();

    }

    public void gotoBasket(){//................Add to Database...................

        floater.setOnClickListener(v -> {

            Intent intent=new Intent(this, Order.class);

            startActivity(intent);

        });

    }

    public void homeKey(){
        homeKey.setOnClickListener(v -> {
            Intent intent=new Intent(Stainless.this, HomePage.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);

        });

    }

    public void menuKey(){
        menuKey.setOnClickListener(v -> {
            Intent intent2=new Intent(Stainless.this, Menu.class);
            startActivity(intent2);
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);


        });

    }

     //For displaying items for sale
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void makeAdaRestaurantAdaptor(){//Attaching list of food items with recycler view for display

        setStainlessOnclickListener();

        stainlessItems=new AdminPage().populateStainlessPage(LoginPage.getAge());

        stainlessRecycler =findViewById(R.id.stainlessKitchen);

        LinearLayoutManager linear=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        stainlessRecycler.setLayoutManager(linear);

        linear.setReverseLayout(true);

        linear.setStackFromEnd(true);

        stainlessAdaptor=new PopulateKitchensWithItemsAdaptor(stainlessItems,adalistener2);

        stainlessRecycler.setAdapter(stainlessAdaptor);



    }


    //For sending data to Order class

    public void setStainlessOnclickListener(){

        adalistener2= (v, position) -> {

            Intent intent5 =new Intent(getApplicationContext(), Order.class);

            intent5.putExtra("name",stainlessItems.get(position).getName());
            intent5.putExtra("imageUrl",stainlessItems.get(position).getImageURL());
            intent5.putExtra("nationality",stainlessItems.get(position).getNationality());
            intent5.putExtra("price",stainlessItems.get(position).getPrice());
            intent5.putExtra("restaurant","Stainless");

            startActivity(intent5);};

    }


    }

