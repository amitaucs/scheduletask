package com.developerworld.dbread.utils;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;


@Service
public class FileWrittingUtils {

    @Value(value = "${mutualfund.filename}")
    private String fileName;

    @Value(value="${mutualfund.url}")
    String urlString;


    public void writeMutualFundToFile() throws IOException {

        System.out.println("File Copy started");

        HttpClient client = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(urlString);
        HttpResponse response = client.execute(httpGet);
        File navtxt = new File(fileName);
        FileUtils.copyInputStreamToFile(response.getEntity().getContent(), navtxt);

        System.out.println("data copied to file successfully");


    }
}
