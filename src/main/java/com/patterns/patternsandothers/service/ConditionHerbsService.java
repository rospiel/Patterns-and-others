package com.patterns.patternsandothers.service;

import com.patterns.patternsandothers.factory.HerbsFactory;
import com.patterns.patternsandothers.interfaces.Herbs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConditionHerbsService {

    private String herbsName = "ginger";

    @Autowired
    private HerbsFactory herbsFactory;

    public Herbs getHerbs() {
        return herbsFactory.getHerbs(herbsName);
    }

    public void setHerbsName(String herbsName) {
        this.herbsName = herbsName;
    }
}
