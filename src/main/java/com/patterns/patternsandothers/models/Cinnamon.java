package com.patterns.patternsandothers.models;

import com.patterns.patternsandothers.interfaces.Herbs;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("cinnamon")
public class Cinnamon implements Herbs {

    @Override
    public String getName() {
        return "Cinnamon";
    }
}
