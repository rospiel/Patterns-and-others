package com.patterns.patternsandothers.factory;

import com.patterns.patternsandothers.interfaces.Herbs;

public interface HerbsFactory {
    Herbs getHerbs(String herbsType);
}
