package com.example.arunkarka.attendancetracking;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class StudentActivity extends ListActivity {
    String[] oneWeekDates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] weekAttendanceList  = {
                "Present",
                "Absent",
                "Present",
                "Present",
                "Present",
                "Present",
                "Present",
        };
        createOneWeekDates();
        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, oneWeekDates, weekAttendanceList);
        setListAdapter(adapter);
        //setContentView(R.layout.activity_student);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void createOneWeekDates() {
        oneWeekDates = new String[7];
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i<7; i++) {
            oneWeekDates[i] = dateFormat.format(cal.getTime());
            cal.add(Calendar.DATE, -1);
        }

    }

    private void createWeekAttendanceList() {

    }
}
