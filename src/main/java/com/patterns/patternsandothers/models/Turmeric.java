package com.patterns.patternsandothers.models;

import com.patterns.patternsandothers.interfaces.Herbs;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("turmeric")
public class Turmeric implements Herbs {

    @Override
    public String getName() {
        return "Turmeric";
    }
}
