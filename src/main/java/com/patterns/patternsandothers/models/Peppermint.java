package com.patterns.patternsandothers.models;

import com.patterns.patternsandothers.interfaces.Herbs;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("peppermint")
public class Peppermint implements Herbs {

    @Override
    public String getName() {
        return "Peppermint";
    }
}
