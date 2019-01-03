package com.brenohff.whazzup.whazzup.api;

import com.brenohff.whazzup.whazzup.service.WhazzupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by breno.franco on 03/01/2019
 */

@RestController
@RequestMapping("whazzup")
public class WhazzupController {

    @Autowired
    private WhazzupService whazzupService;

    @GetMapping("getWhazzupFile")
    public void getWhazzupFile() {
        whazzupService.getFileFromUrl();
    }
}