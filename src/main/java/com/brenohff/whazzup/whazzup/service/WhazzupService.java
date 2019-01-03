package com.brenohff.whazzup.whazzup.service;

import com.brenohff.whazzup.whazzup.models.IvaoPilot;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by breno.franco on 03/01/2019
 */

@Service
public class WhazzupService {

    public List<IvaoPilot> getFileFromUrl() {

        List<IvaoPilot> pilotList = new ArrayList<>();

        try {
            URL url = new URL("http://api.ivao.aero/getdata/whazzup/whazzup.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            pilotList = setObject(IOUtils.toString(in));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pilotList;
    }

    private List<IvaoPilot> setObject(String line) {
        Integer generalDataBegin = line.indexOf("!GENERAL");
        Integer clientsDataBegin = line.indexOf("!CLIENTS");
        Integer airportsDataBegin = line.indexOf("!AIRPORTS");
        Integer serversDataBegin = line.indexOf("!SERVERS");

        String[] generalData = line.substring(generalDataBegin + 9, clientsDataBegin).split("\n");
        String[] clientsData = line.substring(clientsDataBegin + 9, airportsDataBegin).split("\n");
        String[] airportsData = line.substring(airportsDataBegin + 10, serversDataBegin).split("\n");
        String[] serversData = line.substring(serversDataBegin + 9).split("\n");

        List<IvaoPilot> pilotList = new ArrayList<>();

        for (String client : clientsData) {
            String[] newClientData = client.split(":");
            if (newClientData[3].equalsIgnoreCase("PILOT")) {
                pilotList.add(new IvaoPilot(newClientData));
            }
        }

        return pilotList;
    }

    public static void main(String[] args) {
        WhazzupService service = new WhazzupService();
        service.getFileFromUrl();
    }

}