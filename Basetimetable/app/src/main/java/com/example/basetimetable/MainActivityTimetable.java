package com.example.basetimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.Mondaymorning.MondayMorning;
//import layout.WednesdayMorning.WednesdayMorning;
//import layout.WednesdayMorning.WednesdayMorning; // in intent import if class is not defined

import static android.R.attr.action;
import static android.R.attr.id;
import static android.R.attr.variablePadding;


/*public class Morn{
    String books;

    void button(){
        setContentView(R.layout);
    }

}*/

public class MainActivityTimetable extends AppCompatActivity {

    /*
   public class Morn{
        String books;

        void button(){
            setContentView(R.layout);
        }

    }
*/





    public Button MondayMorning;// Button is wiget MondayMorning is it's id


    public void init(){// init is the name of method () means it takes no arguments.
        MondayMorning = (Button)findViewById(R.id.MondayMorning);// R = resource.
        MondayMorning.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(MainActivityTimetable.this,MondayMorning.class);// Intent = intent to do something, an action. Toy is Intent name.


                startActivity(toy);// lets activity run.
            }
        });

    }
    public Button TuesdayMorning;   //Buttons id is TuesdayMorning

    public void ini(){// ini is the name.
        TuesdayMorning = (Button)findViewById(R.id.TuesdayMorning);// Normally R.id.xyz can be filled in with auto text. To resolve (R.id.Red R) go to activity_main_timetable.xml text find button change top line to android:id="@+id/TuesdayMorning".   R = resource
        TuesdayMorning.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oy = new Intent(MainActivityTimetable.this,TuesdayMorning.class);// Intent = intent to do something, an action. oy is Intent name.


                startActivity(oy);// lets activity run.

                //Remember to call method in
                // @Override
           // protected void onCreate(Bundle savedInstanceState) {
             //   super.onCreate(savedInstanceState);
               // setContentView(R.layout.activity_main_timetable);
                //init();
                //ini();
            }
        });

    }

    public Button WednesdayMorning;


    public void in(int i, final java.lang.Class m){
        WednesdayMorning = (Button)findViewById(i);// R = resource.
        WednesdayMorning.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(MainActivityTimetable.this,m); // Use auto complete   Intent = intent to do something, an action.


                startActivity(to);// lets activity run.
            }
        });

    }//remember to call it in @Override








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_timetable);
        //init(); github git pidgeon bush seagull breakfast 6seagullbushgit
        //ini();
        in(R.id.MondayMorning,MondayMorning.class);
        in(R.id.TuesdayMorning,TuesdayMorning.class);
        in(R.id.WednesdayMorning,WedMorn.class);
        //in();

    }

}



