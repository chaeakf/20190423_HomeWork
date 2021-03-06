package com.example.a20190423_homework;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

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
        // 클릭시 룸 상세페이지
        act.roomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Room clickRoomData = roomList.get(position);

                Intent intent = new Intent(MainActivity.this, DetailRoomActivity.class);
                intent.putExtra("방정보", clickRoomData);
                startActivity(intent);

            }
        });

        //롱클릭시 룸 삭제
        act.roomListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                roomList.remove(position);

                mRoomAdapter.notifyDataSetChanged();

                return true;
            }
        });

        act.addRoomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomList.add(new Room(110,33,"경상북도 구미시 신평동",42,"분리형원룸","놀자놀자놀자"));
                mRoomAdapter.notifyDataSetChanged();

                act.roomListView.smoothScrollToPosition(roomList.size()-1);

            }
        });


    }




    void fillRoom(){

        roomList.add(new Room(100,13,"경상북도 구미시 송정동",2,"분리형원룸","풀옵션 초대박 원룸"));
        roomList.add(new Room(100,15,"경상북도 구미시 신평동",3,"분리형원룸","깨끗한사무실"));
        roomList.add(new Room(100,13,"경상북도 구미시 원평동",3,"분리형원룸","풀옵션강력추천"));
        roomList.add(new Room(100,13,"경상북도 구미시 형곡동",2,"분리형원룸","풀욥션 초대박 원룸"));
        roomList.add(new Room(100,13,"경상북도 구미시 신평동",2,"분리형원룸","먹자골목인근"));


    }
}
