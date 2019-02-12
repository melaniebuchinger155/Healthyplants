package buchinger.melanie.healthyplants;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Impressum_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impressum_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



    public void onClickfab(View view) {
        Intent i = new Intent(this, meinGartenActivity.class);
        startActivity(i);
    }

    public void onButtonClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), Impressum_activity.class);
        startActivity(myIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            case R.id.beschreibungid:
                startActivity(new Intent(this, BeschreibungActivitiy.class));
                return true;


            case R.id.hilfeid:
                startActivity(new Intent(this, HilfeActivity2.class));
                return true;

            case R.id.faqs:
                startActivity(new Intent(this, faqActivity.class));
                return true;


            case R.id.impressum:
                startActivity(new Intent(this, Impressum_activity.class));
                return true;


            case R.id.close:
                startActivity(new Intent(this, closeactivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }}