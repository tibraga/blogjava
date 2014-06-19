package com.tibraga.file;

import java.io.File;
import java.io.IOException;

public class FilePermissionExample {
	public static void main(String[] args) {
		try {

			File file = new File("/tibraga/script.sh");

			if (file.exists()) {
				System.out.println("Can Execute : " + file.canExecute());
				System.out.println("Can Write : " + file.canWrite());
				System.out.println("Can Read : " + file.canRead());
			}

			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);

			System.out.println("Can Execute : " + file.canExecute());
			System.out.println("Can Write : " + file.canWrite());
			System.out.println("Can Read : " + file.canRead());

			if (file.createNewFile()) {
				System.out.println("File created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
