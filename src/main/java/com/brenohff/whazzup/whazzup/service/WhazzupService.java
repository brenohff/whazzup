package com.brenohff.whazzup.whazzup.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by breno.franco on 03/01/2019
 */

@Service
public class WhazzupService {

    private final static String WHAZZUP = "http://api.ivao.aero/getdata/whazzup/whazzup.txt";

    public void getFileFromUrl() {
        try {
            URL url = new URL(WHAZZUP);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                setObject(line);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setObject(String line){
        System.out.println(line);
    }

}