package com.bapsdelhibalmandal.balbalika_management_system.service;

import com.bapsdelhibalmandal.balbalika_management_system.model.SabhaKshetra;

import java.util.List;
import java.util.Optional;

public interface SabhaKshetraService {
    SabhaKshetra saveSabhaKshetra(SabhaKshetra sabhaKshetra);
    Optional<SabhaKshetra> getSabhaKshetraById(Integer id);
    List<SabhaKshetra> getAllSabhaKshetras();
    void deleteSabhaKshetra(Integer id);
}
