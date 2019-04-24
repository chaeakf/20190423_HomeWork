package com.example.a20190423_homework;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a20190423_homework.databinding.ActivityDetailRoomBinding;
import com.example.a20190423_homework.datas.Room;

public class DetailRoomActivity extends AppCompatActivity {

    Room mRoomData;

    ActivityDetailRoomBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_detail_room);

        mRoomData = (Room) getIntent().getSerializableExtra("방정보");

        act.depositAndMonthPayTxt.setText(String.format("%d / %d", mRoomData.deposit, mRoomData.month_pay));
        act.memoTxt.setText(mRoomData.memo);

    }
}
