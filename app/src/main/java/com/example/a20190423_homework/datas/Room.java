package com.example.a20190423_homework.datas;

public class Room {

    public int deposit; // 보증금
    public int month_pay; //월세
    public String location; // 주소
    public int floor; //층수
    public String description; //설명 문구
    public String memo;

    public Room(int deposit, int month_pay, String location, int floor, String description, String memo) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
        this.memo = memo;

    }
}
