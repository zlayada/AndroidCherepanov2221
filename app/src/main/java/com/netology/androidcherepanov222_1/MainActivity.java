package com.netology.androidcherepanov222_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = findViewById(R.id.toolbar); // Создали экземпляр тулбар
        setSupportActionBar(mToolBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Добавили меню в панель действий
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {

            Intent intentNotes = new Intent(MainActivity.this, MainActivityNotes.class); // Создаем интент для перехода на экран записок
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_time_task) {

            Intent intentNotes = new Intent(MainActivity.this, MainActivityTask.class); // Создаем интент для перехода на экран сроков задач
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_spinner) {

            Intent intentNotes = new Intent(MainActivity.this, MainActivitySpinner.class); // Создаем интент для перехода на экран выбора адреса
            startActivity(intentNotes);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
