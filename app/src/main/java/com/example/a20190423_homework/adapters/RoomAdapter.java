package com.example.a20190423_homework.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.a20190423_homework.R;
import com.example.a20190423_homework.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list){
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

            if(row == null){
                row = inf.inflate(R.layout.room_list_item, null);

            }
        Room roomData = mList.get(position);
        TextView depositAndmonthPayAndfloorTxt = row.findViewById(R.id.depositAndmonthPayAndfloorTxt);
        TextView locationTxt = row.findViewById(R.id.locationTxt);
        TextView descriptionTxt = row.findViewById(R.id.descriptionTxt);
        TextView memoTxt = row.findViewById(R.id.memoTxt);

        depositAndmonthPayAndfloorTxt.setText(String.format("%d / %d  %d층",roomData.deposit, roomData.month_pay, roomData.floor));
        locationTxt.setText(roomData.location);
        descriptionTxt.setText(roomData.description);
        memoTxt.setText(roomData.memo);
        return row;
    }
}
