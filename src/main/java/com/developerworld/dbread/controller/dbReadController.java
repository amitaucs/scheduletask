package com.developerworld.dbread.controller;


import com.developerworld.dbread.entities.MutualFund;
import com.developerworld.dbread.service.DbReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/dbread")
public class dbReadController {

    @Autowired

    DbReadService dbReadService;

    @GetMapping("/getAllMutualFund")
    public ResponseEntity<List<MutualFund>> getAllMutualFund() {


        List<MutualFund> mutualFundList = dbReadService.fetchAllMutualFund();
        if (mutualFundList.size() > 0)
            return ResponseEntity.status(HttpStatus.OK).body((mutualFundList));
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }


}
