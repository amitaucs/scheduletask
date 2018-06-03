package com.developerworld.dbread.service;

import com.developerworld.dbread.entities.MutualFund;
import com.developerworld.dbread.repo.MutualFundRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbReadService {

    @Autowired
    MutualFundRepo mutualFundRepo;

    public List<MutualFund> fetchAllMutualFund(){

        return mutualFundRepo.findAll();
    }
}
