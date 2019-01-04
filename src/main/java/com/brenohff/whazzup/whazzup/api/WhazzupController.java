package com.brenohff.whazzup.whazzup.api;

import com.brenohff.whazzup.whazzup.models.WhazzupFile;
import com.brenohff.whazzup.whazzup.service.WhazzupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by breno.franco on 03/01/2019
 */

@RestController
@RequestMapping("whazzup")
public class WhazzupController {

    @Autowired
    private WhazzupService whazzupService;

    @GetMapping(value = "getWhazzupFile", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public WhazzupFile getWhazzupFile(@RequestParam("listType") String listType) {
        return whazzupService.getAtcOrPilotList(listType);
    }
}