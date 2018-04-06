package com.example.bashirbin.my_emergency_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class Navigation_Activity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

   /* Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);


        //setContentView(R.layout.activity_navigation_);




        // to add the navigation we first add the design libarary
        //appcompat and design librarry
        // remove android default tool bar from the style

        // creatiing connection for the toolabr
        toolbar = (Toolbar) findViewById(R.id.navigation_toolbar);
        setSupportActionBar(toolbar);

        // next we creat for the nagivation Drawer

        // we instantiate the drawers and navigation
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nagivation_view);


        // action bar the three dotted line or hamburger icon
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_navigation, R.string.close_naviagtion);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


/*


        // setting up NAVIGATION_listerner for the navigation_view

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.police_icon) {
                    Toast.makeText(getApplicationContext(), "police selectedd ", Toast.LENGTH_SHORT).show();
                   // Intent goto_police = new Intent(getApplicationContext(), Police_menu.class);
                   // startActivity(goto_police);
                }

               *//* if (id == R.id.ambulance_icon) {
                    Toast.makeText(NavigationActivity.this, "ambulance selectedd ", Toast.LENGTH_SHORT).show();
                    Intent goto_police = new Intent(getApplicationContext(), Ambulance_menu.class);
                    startActivity(goto_police);
                }
                if (id == R.id.fire_service) {
                    Toast.makeText(NavigationActivity.this, "fire service selected ", Toast.LENGTH_SHORT).show();
                    Intent goto_police = new Intent(getApplicationContext(), FireService_menu.class);
                    startActivity(goto_police);
                }
*//*

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


*/
    }
}
