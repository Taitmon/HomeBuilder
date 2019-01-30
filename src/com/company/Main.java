package com.company;

public class Main
{

    public static void main(String[] args)
    {
        House house = new House(7);

        //house.roomcount(); will not allow the room count value to be change in the main class.

        System.out.println(house.getRoomCount());
    }
}
