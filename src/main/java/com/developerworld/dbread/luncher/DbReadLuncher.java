package com.developerworld.dbread.luncher;

import com.developerworld.dbread.scheduler.DbReadScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;


@Service
public class DbReadLuncher {

    @Autowired
    DbReadScheduler timer;

    public  void dataReadStarter(int targetHour, int targetMin, int targetSec) throws IOException {

        if(targetHour==0 && targetMin ==0 && targetSec ==0){

            targetHour = LocalDateTime.now().getHour();
            targetMin = LocalDateTime.now().getMinute();
            targetSec = LocalDateTime.now().getSecond();
        }

        timer.startExecutionAt(targetHour,targetMin,targetSec);


    }
}
