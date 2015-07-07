package com.example.arunkarka.attendancetracking;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class StudentActivity extends ActionBarActivity {
    private ArrayList<String> weekAttendanceList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weekAttendanceList.add("Present");
        weekAttendanceList.add("Present");
        weekAttendanceList.add("Present");
        weekAttendanceList.add("Present");
        weekAttendanceList.add("Present");
        weekAttendanceList.add("Absent");
        weekAttendanceList.add("Absent");
        setContentView(R.layout.activity_student);

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
}
