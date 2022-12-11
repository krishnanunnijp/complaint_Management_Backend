package com.example.complaint_Management_Backend.dao;

import com.example.complaint_Management_Backend.model.Complaints;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface complaintDao extends CrudRepository<Complaints, Integer> {

    @Query(value = "SELECT u.`address`, u.`email`, u.`name`, u.`phoneno` , c.complaints  FROM `user` u JOIN complaints c ON c.user_id = u.id",nativeQuery = true)
    List<Map<String,String>> complaints();

}
