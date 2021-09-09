package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {

}
