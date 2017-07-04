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


public class MainActivityTimetable extends AppCompatActivity {


    public Button MondayMorning;// Button is wiget MondayMorning is it's id
    public Button TuesdayMorning;   //Buttons id is TuesdayMorning
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

        in(R.id.MondayMorning,MondayMorning.class);
        in(R.id.TuesdayMorning,TuesdayMorning.class);
        in(R.id.WednesdayMorning,WedMorn.class);


    }

}



