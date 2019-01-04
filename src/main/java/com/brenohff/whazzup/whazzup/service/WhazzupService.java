package com.brenohff.whazzup.whazzup.service;

import com.brenohff.whazzup.whazzup.enums.AtcRating;
import com.brenohff.whazzup.whazzup.models.IvaoATC;
import com.brenohff.whazzup.whazzup.models.IvaoPilot;
import com.brenohff.whazzup.whazzup.models.WhazzupFile;
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

    private WhazzupFile getFileFromUrl() {

        WhazzupFile whazzupFile;

        try {
            URL url = new URL("http://api.ivao.aero/getdata/whazzup/whazzup.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            whazzupFile = setObject(IOUtils.toString(in));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            whazzupFile = new WhazzupFile();
        }

        return whazzupFile;

    }

    private WhazzupFile setObject(String line) {
        Integer generalDataBegin = line.indexOf("!GENERAL");
        Integer clientsDataBegin = line.indexOf("!CLIENTS");
        Integer airportsDataBegin = line.indexOf("!AIRPORTS");
        Integer serversDataBegin = line.indexOf("!SERVERS");

        String[] generalData = line.substring(generalDataBegin + 9, clientsDataBegin).split("\n");
        String[] clientsData = line.substring(clientsDataBegin + 9, airportsDataBegin).split("\n");
        String[] airportsData = line.substring(airportsDataBegin + 10, serversDataBegin).split("\n");
        String[] serversData = line.substring(serversDataBegin + 9).split("\n");

        return new WhazzupFile(generalData, clientsData, airportsData, serversData);

    }

    public WhazzupFile getAtcOrPilotList(final String listType) {
        WhazzupFile whazzupFile = getFileFromUrl();
        List<IvaoPilot> pilotList = new ArrayList<>();
        List<IvaoATC> atcList = new ArrayList<>();

        switch (listType) {
            case "PILOT":
                for (String client : whazzupFile.getClientsData()) {
                    String[] newClientData = client.split(":");
                    if (newClientData[3].equalsIgnoreCase("PILOT")) {
                        pilotList.add(new IvaoPilot(newClientData));
                    }
                }

                whazzupFile.setIvaoPilots(pilotList);
                break;

            case "ATC":
                for (String client : whazzupFile.getClientsData()) {
                    String[] newClientData = client.split(":");
                    if (newClientData[3].equalsIgnoreCase("ATC")) {
                        atcList.add(new IvaoATC(newClientData));
                    }
                }

                whazzupFile.setIvaoATCS(atcList);
                break;

            case "BOTH":
                for (String client : whazzupFile.getClientsData()) {
                    String[] newClientData = client.split(":");
                    if (newClientData[3].equalsIgnoreCase("PILOT")) {
                        pilotList.add(new IvaoPilot(newClientData));
                    } else {
                        atcList.add(new IvaoATC(newClientData));
                    }
                }

                whazzupFile.setIvaoPilots(pilotList);
                whazzupFile.setIvaoATCS(atcList);
                break;
        }

        return whazzupFile;
    }

    public static void main(String[] args) {
        WhazzupService service = new WhazzupService();
        service.getAtcOrPilotList("ATC");
    }

}