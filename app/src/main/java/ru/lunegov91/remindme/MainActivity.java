package ru.lunegov91.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by Антон on 24.05.2015.
 */
public class MainActivity extends Activity {

    private Toolbar _toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initToolbar();
    }

    private void initToolbar() {
        _toolbar = (Toolbar)findViewById(R.id.toolbar);
        _toolbar.setTitle(R.string.app_name);
        _toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
        _toolbar.inflateMenu(R.menu.menu);
    }
}
