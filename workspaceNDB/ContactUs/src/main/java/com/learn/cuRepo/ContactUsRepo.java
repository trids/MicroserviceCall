package com.learn.cuRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.cuEntity.ContactUsEntity;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsEntity, Integer>{

}
