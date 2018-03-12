package question3;

import java.io.*;

public class ReadFile {

    private static ReadFile readFile = null;
    private int value;

    private ReadFile(){}

    public static ReadFile getInstance() {
        if (readFile == null) {
            synchronized (ReadFile.class) {
                if (readFile == null) {
                    readFile = new ReadFile();
                }
            }
        }
        return readFile;
    }

    public void calculate() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/shreyansh/input.txt"));
            value = Integer.valueOf(bufferedReader.readLine());
            System.out.println(Thread.currentThread().getName() + " : current value : " + value);
            value = value * 2;
            System.out.println(Thread.currentThread().getName() + " : new value : " + value);
            bufferedReader.close();
            String str=String.valueOf(value);
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/shreyansh/input.txt"));
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
