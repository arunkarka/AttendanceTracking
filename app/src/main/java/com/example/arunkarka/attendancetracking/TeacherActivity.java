package com.example.arunkarka.attendancetracking;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class TeacherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        String[] values = new String[] { "Monica", "Kavya", "Arjun",
                "John", "Abbas", "Yuvraj", "Modi", "Jaya",
                "Kavitha", "Tommy" };
        ListView lv = (ListView) findViewById(R.id.student_list);
        lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.student_name, values));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView< ?> parent, View view, int position, long id) {

                String studentName = ((TextView) view.findViewById(R.id.student_name)).getText().toString();
                Intent launchStudentAct = new Intent(getApplicationContext(), StudentActivity.class);
                launchStudentAct.putExtra("STUDENT_NAME", studentName);
                startActivity(launchStudentAct);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teacher, menu);
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
