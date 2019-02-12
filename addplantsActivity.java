package buchinger.melanie.healthyplants;

import android.content.Intent;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class addplantsActivity  extends Activity {

    EditText etFirstName,etLastName,etFavFood;
    Button btnAdd,btnView;
    DatabaseHelper myDB;


    ImageView imageViewplaceholder;
    Button buttonphoto;
    Button picturebutton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_addplants );
        etFavFood = (EditText) findViewById( R.id.etFavFood );
        etFirstName = (EditText) findViewById( R.id.etFirstName );
        etLastName = (EditText) findViewById( R.id.etLastName );
        btnAdd = (Button) findViewById( R.id.btnAdd );
        btnView = (Button) findViewById( R.id.btnView );
        myDB = new DatabaseHelper( this );


        Button button = (Button) findViewById( R.id.photobutton );
        imageViewplaceholder = (ImageView) findViewById( R.id.imageViewplaceholder );


        button.setOnClickListener( new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MediaStore.ACTION_IMAGE_CAPTURE );
                startActivityForResult( intent, 0 );

            }


        } );


        btnView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( addplantsActivity.this, meinGartenActivity.class );
                startActivity( intent );

            }
        } );

        btnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName = etFirstName.getText().toString();
                String lName = etLastName.getText().toString();
                String fFood = etFavFood.getText().toString();
                if ( fName.length() != 0 && lName.length() != 0 && fFood.length() != 0 ) {
                    AddData( fName, lName, fFood );
                    etFavFood.setText( "Tag" );
                    etLastName.setText( "" );
                    etFirstName.setText( "" );
                } else {
                    Toast.makeText( addplantsActivity.this, "Du musst die Textfelder füllen ;)", Toast.LENGTH_LONG ).show();
                }

            }
        } );


    }




    public void AddData(String firstName,String lastName, String favFood ){
        boolean insertData = myDB.addData(firstName,lastName,favFood);

        if(insertData==true){
            Toast.makeText(addplantsActivity.this,"Super",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(addplantsActivity.this,"Irgendetwas ist schief gelaufen :(",Toast.LENGTH_LONG).show();
        }

    }



    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get ("data");
        imageViewplaceholder .setImageBitmap(bitmap);



    }

}
