package com.example.library.service.imple;

import com.example.library.dto.AdminDto;
import com.example.library.model.Admin;
import com.example.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    @Override
    public Admin findByUsername(String username){
        return null;
    }
    @Override
    public Admin save(AdminDto adminDto){
        return null;
    }
}
