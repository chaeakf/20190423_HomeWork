package com.example.a20190423_homework;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a20190423_homework.adapters.RoomAdapter;
import com.example.a20190423_homework.databinding.ActivityMainBinding;
import com.example.a20190423_homework.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RoomAdapter mRoomAdapter;
    List<Room> roomList = new ArrayList<>();
    ActivityMainBinding act;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        fillRoom();

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);
    }

    void fillRoom(){

        roomList.add(new Room(100,13,"경상북도 구미시 송정동",2,"분리형원룸","풀옵션 초대박 원룸"));
        roomList.add(new Room(100,15,"경상북도 구미시 신평동",3,"분리형원룸","깨끗한사무실"));
        roomList.add(new Room(100,13,"경상북도 구미시 원평동",3,"분리형원룸","풀옵션강력추천"));
        roomList.add(new Room(100,13,"경상북도 구미시 형곡동",2,"분리형원룸","풀욥션 초대박 원룸"));
        roomList.add(new Room(100,13,"경상북도 구미시 신평동",2,"분리형원룸","먹자골목인근"));


    }
}
