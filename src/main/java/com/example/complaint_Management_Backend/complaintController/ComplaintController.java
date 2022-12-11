package com.example.complaint_Management_Backend.complaintController;

import com.example.complaint_Management_Backend.dao.complaintDao;
import com.example.complaint_Management_Backend.model.Complaints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ComplaintController {

    @Autowired
    complaintDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addComplaint",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addComplaint(@RequestBody Complaints c){
        HashMap<String, String> map = new HashMap<>();
        dao.save(c);
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewAllComplaints")
    public List<Map<String, String>> viewAll(){
        return (List<Map<String,String>>) dao.complaints();
    }
}
