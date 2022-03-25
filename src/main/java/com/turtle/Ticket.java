package com.turtle;

public class Ticket {
     public final static int TAIPEI_STATION = 100;
     public final static int TAICHUNG_STATION = 200;
     public final static int KAOHSIUNG_STATION = 300;
     int start;
     int destination;
     int price;
     public Ticket(int start, int destination){
          this.start = start;
          this.destination = destination;
     }

}
