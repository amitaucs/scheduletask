package com.developerworld.dbread;

import com.developerworld.dbread.luncher.DbReadLuncher;
import com.developerworld.dbread.service.DbReadService;
import com.developerworld.dbread.utils.FileWrittingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class DbreadApplication {

	@Autowired
	DbReadLuncher dbReadLuncher;

	static private int startHour ;
	static private int startMinute;
	static private int startSecond;

	public static void main(String[] args) {

		if (args.length < 2){

			startHour = 00;
			startMinute = 00;
			startSecond = 00;
		}

		else {

			startHour = Integer.parseInt(args[0]);
			startMinute = Integer.parseInt(args[1]);
			startSecond = Integer.parseInt(args[2]);
		}

		SpringApplication.run(DbreadApplication.class, args);

	}

	@PostConstruct
	void loadDatatoFile() throws IOException {

		dbReadLuncher.dataReadStarter(startHour,startMinute,startSecond);

	}

}
