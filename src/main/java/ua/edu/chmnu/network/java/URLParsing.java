package ua.edu.chmnu.network.java;

import java.net.URL;
import java.util.Scanner;

public class URLParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("URL Parser - Enter 'stop' to exit.");

        while (true) {
            System.out.print("\nEnter a URL: ");
            String inputUrl = scanner.nextLine();

            if (inputUrl.equalsIgnoreCase("stop")) {
                System.out.println("Exiting the URL parser.");
                break;
            }

            try {

                URL url = new URL(inputUrl);

                System.out.println("Protocol: " + url.getProtocol());
                System.out.println("Host: " + url.getHost());
                System.out.println("Port: " + (url.getPort() != -1 ? url.getPort() : "None"));
                System.out.println("Path: " + (url.getPath().isEmpty() ? "None" : url.getPath()));
                System.out.println("Query: " + (url.getQuery() != null ? url.getQuery() : "None"));
                System.out.println("Fragment: " + (url.getRef() != null ? url.getRef() : "None"));
            } catch (Exception e) {
                System.out.println("Invalid URL: " + e.getMessage());
            }
        }

        scanner.close();
    }
}