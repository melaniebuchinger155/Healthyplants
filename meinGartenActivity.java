package buchinger.melanie.healthyplants;

import android.content.Intent;
import android.database.Cursor;
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
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class meinGartenActivity extends AppCompatActivity {

    boolean pressedOnce;




    DatabaseHelper myDB;
    ArrayList<User> userList;
    ListView listView;
    User user;
    View view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcontents_layout); //Die meinGartenActivity bezieht sich bewusst nicht auf die activity_meingarte.xml
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        myDB = new DatabaseHelper(this);

        userList = new ArrayList<>();
        Cursor data = myDB.getListContents();
        int numRows = data.getCount();
        if(numRows == 0){
            Toast.makeText(meinGartenActivity.this,"Du hast keine deiner Pflanzen eingegeben  :(.",Toast.LENGTH_LONG).show();
        }else{
            int i=0;
            while(data.moveToNext()){
                user = new User(data.getString(1),data.getString(2),data.getString(3));
                userList.add(i,user);
                System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3));
                System.out.println(userList.get(i).getFirstName());
                i++;
            }
            ThreeColumn_ListAdapter adapter =  new ThreeColumn_ListAdapter(this,R.layout.list_adapter_view, userList);
            listView = (ListView) findViewById(R.id.listView1);
            listView.setAdapter(adapter);
        }



    }



    public boolean onKeyDown(int keyCode, KeyEvent event) { //App beendet sich bei Doppelklick auf Zurückknopf, warnt zuvor mit einem Toast!

        if (keyCode == event.KEYCODE_BACK) {

            if (!pressedOnce) {
                pressedOnce = true;
                Toast.makeText(getApplicationContext(), "Erneut drücken, um zu beenden", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pressedOnce = false;
                    }
                }, 3000);
            } else if (pressedOnce) {
                pressedOnce =false;
                onBackPressed();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






    @Override                                //Verhindert das zurückkehhren zur Startseite
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void onClickaddplantsbtn(View v) {
        Intent myIntent = new Intent(getBaseContext(), addplantsActivity.class);
        startActivity(myIntent);
    }


    public void onClicklexikonbtn(View v) {
        Intent myIntent = new Intent(getBaseContext(), ListMainActivity.class);
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
                startActivity(new Intent (this, BeschreibungActivitiy.class));
                return true;


            case R.id.hilfeid:
                startActivity(new Intent (this, HilfeActivity2.class));
                return true;

            case R.id.faqs:
                startActivity(new Intent (this, faqActivity.class));
                return true;


            case R.id.impressum:
                startActivity(new Intent (this, Impressum_activity.class));
                return true;


            case R.id.close:
                startActivity(new Intent (this, closeactivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);



        }
    }





}









