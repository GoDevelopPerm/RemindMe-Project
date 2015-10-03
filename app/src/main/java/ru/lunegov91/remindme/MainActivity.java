package ru.lunegov91.remindme;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewParent;

import ru.lunegov91.remindme.adapter.TabsPagerFragmentAdapter;

/**
 * Created by Антон on 24.05.2015.
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar _toolbar;
    private DrawerLayout _drawLayout;
    private TabLayout _tabLayout;
    private ViewPager _viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initToolbar();
        initNavigationView();
        initTabs();


    }

    private void initToolbar() {
        _toolbar = (Toolbar)findViewById(R.id.toolbar);
        _toolbar.setTitle(R.string.app_name);
        _toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        _toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
        _toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
        _drawLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, _drawLayout, _toolbar, R.string.view_navigation_open, R.string.view_navigation_close);
        _drawLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =(NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                _drawLayout.closeDrawers();
                switch (menuItem.getItemId()){
                    case R.id.actionNotifiactionItem:
                        showNotificationTab();
                }
                return true;
            }
        });
    }

    private void initTabs() {
        _viewPager = (ViewPager)findViewById(R.id.view_pager);
        TabsPagerFragmentAdapter adapter =  new TabsPagerFragmentAdapter(getSupportFragmentManager());
        _viewPager.setAdapter(adapter);
        _tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        _tabLayout.setupWithViewPager(_viewPager);

    }

    private void showNotificationTab(){
        _viewPager.setCurrentItem(Constants.TAB_TWO);
    }
}
