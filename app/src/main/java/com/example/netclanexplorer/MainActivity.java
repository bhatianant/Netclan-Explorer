package com.example.netclanexplorer;

import static android.widget.Toast.makeText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    ViewPager viewPager;
    TabLayout tablayout;

    DrawerLayout drawerLayout;

    NavigationView navigationView;

    Toolbar toolbar;

    ImageButton navbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.toolbar));


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navgationView);
        toolbar = findViewById(R.id.toolbar);
        bnv = findViewById(R.id.bnv);
        viewPager = findViewById(R.id.viewpager);
        tablayout = findViewById(R.id.tablayout);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tablayout.setupWithViewPager(viewPager);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);
        toggle.syncState();


        toolbar.setNavigationIcon(R.drawable.baseline_menu_open_24);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if (id == R.id.Profile) {
                    makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }


                return true;
            }
        });

        bnv.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

               int id = item.getItemId();
               if(id==R.id.ex){
                   makeText(MainActivity.this, "Exploral", Toast.LENGTH_SHORT).show();
               }
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.refinemenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
       if(id==R.id.refine){
           makeText(this, "Refine", Toast.LENGTH_SHORT).show();
           Intent i = new Intent(MainActivity.this, RefineActivity.class);
           startActivity(i);
       }

        return super.onOptionsItemSelected(item);
    }
}