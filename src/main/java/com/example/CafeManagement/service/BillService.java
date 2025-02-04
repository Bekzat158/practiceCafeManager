package com.example.CafeManagement.service;

import com.example.CafeManagement.entity.Bill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface BillService {
     ResponseEntity<String> generateReport(Map<String, Object> requestMap);
     ResponseEntity<List<Bill>> getBills();
     ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap);
        ResponseEntity<String> deleteBill(Integer id);
}
