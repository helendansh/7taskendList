package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> stringlist = new ArrayList<>();
	for ( ; ; ) {
	    String s = reader.readLine();
	    if (s.equals("end"))
	        break;
            stringlist.add(s);
	}
	for (int i=0; i<stringlist.size(); i++) {
		System.out.println(stringlist.get(i));
	}
    }

}
