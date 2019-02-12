package buchinger.melanie.healthyplants;


import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListMainActivity extends Activity {


    private static final String TAG ="ListMainActivity";
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_list_main );
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById( R.id.listView );


        // Erstelle die Personen

        Person Kaktus = new Person ( "Kaktus", "jeden 5. Tag",  "Kakteengewächse","drawable://" + R.drawable.kaktus3);
        Person Basilikum = new Person ("Basilikum", "jeden 7. Tag", "Lippenblütler","drawable://" + R.drawable.basilikumpic);
        Person Orchidee = new Person ("Orchidee", "jeden 5. Tag", "Korbblütlern","drawable://" + R.drawable.orchidee);
        Person Primel = new Person ("Primel", "jeden 2. Tag", "Primeln ","drawable://" + R.drawable.primelpic);
        Person AloeVera = new Person ("Aloe Vera", "jeden 7. Tag", "Aloen","drawable://" + R.drawable.aloeverapic);
        Person Palme = new Person ("Palme", "jeden 5. Tag", "Raphia","drawable://" + R.drawable.palme);
        Person Bonsaibaum = new Person ("Bonsaibaum", "jeden 5. Tag", "Lippenblütler","drawable://" + R.drawable.bonsaibaum);
        Person Gummibaum = new Person ("Gummibaum", "jeden 4. Tag", "Lippenblütler","drawable://" + R.drawable.gummibaum);
        Person Schnittlauch = new Person ("Schnittlauch", "jeden 5. Tag", "Raphia","drawable://" + R.drawable.schnittlauchpic);
        Person Physalis = new Person ("Physalis", "jeden 3. Tag", "Aloen","drawable://" + R.drawable.physalispic);
        Person Spitzwegerich = new Person ("Spitzwegerich", "jeden 5. Tag", "Korbblütlern","drawable://" + R.drawable.spitzwegerichpic);
        Person Thymian = new Person ("Thymian", "jeden 4. Tag", "Lippenblütler","drawable://" + R.drawable.thymianpic);
        Person Peperoni = new Person ("Peperoni", "jeden 5. Tag", "Korbblütlern","drawable://" + R.drawable.peperonipic);
        Person Paprika = new Person ("Paprika", "jeden 2. Tag", "Aloen","drawable://" + R.drawable.paprikapic);
        Person Tulpe = new Person ("Tulpe", "jeden 3. Tag", "Lippenblütler","drawable://" + R.drawable.tulpepic);


        //Hinzufügen der Personen in eine ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(AloeVera);
        peopleList.add(Basilikum);
        peopleList.add(Bonsaibaum);
        peopleList.add(Gummibaum);
        peopleList.add(Kaktus);
        peopleList.add(Orchidee);
        peopleList.add(Palme);
        peopleList.add(Paprika);
        peopleList.add(Peperoni);
        peopleList.add(Physalis);
        peopleList.add(Primel);
        peopleList.add(Schnittlauch);
        peopleList.add(Spitzwegerich);
        peopleList.add(Thymian);
        peopleList.add(Tulpe);

        peopleList.add(AloeVera);
        peopleList.add(Basilikum);
        peopleList.add(Bonsaibaum);
        peopleList.add(Gummibaum);
        peopleList.add(Kaktus);
        peopleList.add(Orchidee);
        peopleList.add(Palme);
        peopleList.add(Paprika);
        peopleList.add(Peperoni);
        peopleList.add(Physalis);
        peopleList.add(Primel);
        peopleList.add(Schnittlauch);
        peopleList.add(Spitzwegerich);
        peopleList.add(Thymian);
        peopleList.add(Tulpe);



        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList  );
        mListView.setAdapter( adapter );
        mListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if(position==0){
                    Intent intent  = new Intent (view.getContext(),aloeveraActivity.class);
                    startActivityForResult( intent ,0 );
                }




                if(position==1){
                    Intent intent  = new Intent (view.getContext(),basilikumActivity.class);
                    startActivityForResult( intent ,1 );
                }

                if(position==2){
                    Intent intent  = new Intent (view.getContext(),primelActivity.class);
                    startActivityForResult( intent ,2 );
                }



                if(position==3){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,3 );
                }


                if(position==4){
                    Intent intent  = new Intent (view.getContext(),primelActivity.class);
                    startActivityForResult( intent ,4 );
                }

                if(position==5){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,5 );
                }

                if(position==6){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,6 );
                }

                if(position==7){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,7 );
                }


                if(position==8){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,8 );
                }


                if(position==9){
                    Intent intent  = new Intent (view.getContext(),orchiedeeActivity.class);
                    startActivityForResult( intent ,9 );
                }





            }});




    }}
