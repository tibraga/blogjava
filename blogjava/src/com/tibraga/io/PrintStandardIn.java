package com.tibraga.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStandardIn {

	public static void main(String args[]) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String input = null;

			while ((input = br.readLine()) != null) {
				System.out.println(input);
			}

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}