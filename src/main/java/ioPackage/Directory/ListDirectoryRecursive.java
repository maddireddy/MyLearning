package ioPackage.Directory;

import java.io.File;

public class ListDirectoryRecursive {

    public static void main(String[] args) {
        File dir = new File("../Learning");  // Escape sequence needed for '\'
        listRecursive(dir);
    }

    public static void listRecursive(File dir) {
        if (dir.isDirectory()) {
            File[] items = dir.listFiles();
            for (File item : items) {
                System.out.println(item.getAbsoluteFile());
                if (item.isDirectory()) listRecursive(item);  // Recursive call
            }
        }
    }
}
