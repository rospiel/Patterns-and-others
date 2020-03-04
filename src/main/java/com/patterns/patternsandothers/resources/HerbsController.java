package com.patterns.patternsandothers.resources;

import com.patterns.patternsandothers.interfaces.Herbs;
import com.patterns.patternsandothers.service.ConditionHerbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HerbsController {

    @Autowired
    private ConditionHerbsService conditionHerbsService;

    @GetMapping("/herbs")
    @ResponseBody
    public String getByName(@RequestParam final String name) {
        conditionHerbsService.setHerbsName(name);
        Herbs herbs = conditionHerbsService.getHerbs();
        return herbs.getName();
    }
}
