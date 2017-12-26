package com.example.hamza.objectbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.abdul_wahab.myobjectbox.R;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Box<com.example.hamza.objectbox.Person> personBox = ((com.example.hamza.objectbox.MyApp) getApplication()).getBoxStore().boxFor(com.example.hamza.objectbox.Person.class);







/*

        for (int i = 2000; i <= 3000; i++) {
            personBox.put(new Person( "name " + i));
            Log.d(TAG, "person name : "+ i);
        }*/

/*

        List<Person> personList = personBox.getAll();
*/

        Person p = personBox.get(500);

        p.name = "changed";

        personBox.put(p);

        Person p2 = personBox.get(500);



        Log.d(TAG, "onCreate: ");


    }
}
