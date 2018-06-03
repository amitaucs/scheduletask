package com.developerworld.dbread.repo;

import com.developerworld.dbread.entities.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutualFundRepo extends JpaRepository<MutualFund,Long>{

}

