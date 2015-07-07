package com.example.arunkarka.attendancetracking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by arun.karka on 7/7/2015.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] weekDates;
    private final String[] oneWeekAttendanceList;

    public MySimpleArrayAdapter(Context context, String[] weekDates, String[] oneWeekAttendanceList) {
        super(context, -1, weekDates);
        this.context = context;
        this.weekDates = weekDates;
        this.oneWeekAttendanceList = oneWeekAttendanceList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView dateLabel = (TextView) rowView.findViewById(R.id.date_label);
        TextView attendance_label = (TextView) rowView.findViewById(R.id.attendance_label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        dateLabel.setText(weekDates[position]);
        attendance_label.setText(oneWeekAttendanceList[position]);
        // change the icon for Windows and iPhone
        String s = weekDates[position];
        if (s.startsWith("iPhone")) {
            imageView.setImageResource(R.drawable.ic_cast_dark);
        } else {
            imageView.setImageResource(R.drawable.ic_cast_light);
        }

        return rowView;
    }
}
