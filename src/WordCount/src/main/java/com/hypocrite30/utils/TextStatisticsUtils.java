package com.hypocrite30.utils;

import java.io.*;

import static com.hypocrite30.Application.ERROR_PARAMETERS;

/**
 * @Description: 「Utils for Context statistics」
 * @Author: Hypocrite30
 * @Date: 2021/5/7 22:54
 */
public class TextStatisticsUtils {

    /**
     * 「Count the number of characters in file」
     *
     * @param fileName File name.
     * @return 「Number of characters in file」
     */
    public static int CharCount(String fileName) {
        BufferedReader fileReader = null;
        fileReader = GetFileInputStream(fileName);
        if (fileReader == null) {
            return ERROR_PARAMETERS;
        }
        int res = 0;
        char[] chars = new char[64];
        try {
            while (fileReader.read(chars, 0, chars.length) != -1) {
                for (char ch : chars) {
                    if (Character.isLetter(ch) || ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r') {
                        res++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    /**
     * 「Count the number of words in file」
     *
     * @param fileName File name.
     * @return 「Number of words in file」
     */
    public static int WordCount(String fileName) {
        BufferedReader fileReader = null;
        fileReader = GetFileInputStream(fileName);
        if (fileReader == null) {
            return ERROR_PARAMETERS;
        }
        int res = 0;
        String str = null;
        try {
            while ((str = fileReader.readLine()) != null) {
                // res += str.split("\\s+").length;
                String s = str.replaceAll("\\s+", ",");
                String[] split = s.split(",");
                for (String ss : split) {
                    if (!"".equals(ss))
                        res++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    /**
     * 「Get File InputStream」
     *
     * @param fileName File name
     * @return BufferedReader
     */
    private static BufferedReader GetFileInputStream(String fileName) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        } catch (FileNotFoundException e) {
            System.out.println("The system could not find the specified path file.");
        }
        return bufferedReader;
    }

}
