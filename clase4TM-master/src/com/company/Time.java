package com.company;

public class Time {

    private long init;
    private long end;

    public void start(){
        init = System.currentTimeMillis();
    }

    public void stop(){
        end = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return end - init;
    }
}
