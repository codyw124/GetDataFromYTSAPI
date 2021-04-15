// package hello;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class DownloadStuff{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s = new Scanner(new File("./filesToDownload.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.nextLine());
        }
        s.close();
        String fileName = "";
        int i = 1;
        int failures = 0;
        ArrayList<String> failedFiles = new ArrayList<String>();
        for(String download : list){
            String[] downloadPieces = download.split("\t");
            fileName = downloadPieces[0];

            try{
                downloadFile(fileName, downloadPieces[1]);
                i++;
                if(i % 100 == 0){
                    System.out.println(i);
                }
            } catch (IOException e) {
                // handle exception
                failures++;
                failedFiles.add(fileName);
            }
        }
        System.out.println("There were " + failures + " failed downloads. The following items failed.");
        for(String failure : failedFiles){
            System.out.println(failure);
        }
        
    }

    public static void downloadFile(String fileName, String url)throws IOException{
        BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("/home/plex/Downloads/torrents/" + fileName + ".torrent");
        byte dataBuffer[] = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
            fileOutputStream.write(dataBuffer, 0, bytesRead);
        }
        fileOutputStream.close();
    }
}