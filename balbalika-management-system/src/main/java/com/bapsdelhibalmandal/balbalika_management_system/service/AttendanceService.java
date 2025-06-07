package com.bapsdelhibalmandal.balbalika_management_system.service;

import com.bapsdelhibalmandal.balbalika_management_system.model.Kid;

import java.util.List;

public interface AttendanceService {

    public Kid addKid(Kid kid);
    public List<Kid> listAllKids();
    public Kid getKidById();
    

}
