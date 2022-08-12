package com.example.diucpc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.diucpc.Fragments.FeedFragment;
import com.example.diucpc.Fragments.HomeFragment;
import com.example.diucpc.Fragments.NotificationFragment;
import com.example.diucpc.Fragments.TeamLIstbyYear;
import com.example.diucpc.Fragments.WingsFragment;
import com.example.diucpc.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.navmenubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!binding.drawerid.isDrawerOpen(GravityCompat.START))
                {

                    binding.drawerid.openDrawer(GravityCompat.START);
                }
                else
                {
                    binding.drawerid.closeDrawer(GravityCompat.START);
                }

            }
        });

        FragmentManager   fm = getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

       ft.add(R.id.fragmentcontainer,new HomeFragment());
       ft.commit();




        binding.navbarID.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id)
                {
                    case R.id.home:
                    {
                        FragmentManager   fm = getSupportFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();

                        ft.replace(R.id.fragmentcontainer,new HomeFragment());
                        ft.commit();

                        Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                        break;

                    }




                    case R.id.notification:
                    {

                        FragmentManager   fm = getSupportFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();

                        ft.replace(R.id.fragmentcontainer,new NotificationFragment());
                        ft.commit();

                        Toast.makeText(MainActivity.this, "notification", Toast.LENGTH_SHORT).show();
                        break;

                    }




                case R.id.team:
                {
                    FragmentManager   fm = getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();

                    ft.replace(R.id.fragmentcontainer,new TeamLIstbyYear());
                    ft.commit();
                    Toast.makeText(MainActivity.this, "Team", Toast.LENGTH_SHORT).show();
                    break;

                }




                    case R.id.wings:
                    {
                        FragmentManager   fm = getSupportFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();

                        ft.replace(R.id.fragmentcontainer,new WingsFragment());
                        ft.commit();
                        Toast.makeText(MainActivity.this, "wings", Toast.LENGTH_SHORT).show();
                        break;

                    }

                    case R.id.feed:
                    {
                        FragmentManager   fm = getSupportFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();

                        ft.replace(R.id.fragmentcontainer,new FeedFragment());
                        ft.commit();
                        Toast.makeText(MainActivity.this, "Feed", Toast.LENGTH_SHORT).show();
                        break;

                    }

                    default:
                        Toast.makeText(MainActivity.this, "default", Toast.LENGTH_SHORT).show();

                }

                return true;
            }
        });
        binding.navbarID.setSelectedItemId(R.id.home);




    }

    public void navbtn(View view) {




    }
}