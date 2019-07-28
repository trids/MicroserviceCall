package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.entity.SignUpEntity;

@Repository("repo")
public interface LoginSignUpRepo extends JpaRepository<SignUpEntity, Integer>{

}
