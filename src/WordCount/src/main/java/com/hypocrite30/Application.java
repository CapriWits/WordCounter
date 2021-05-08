package com.hypocrite30;


import com.hypocrite30.utils.TextStatisticsUtils;

/**
 * @Description: 「WordCount Project Entrance」
 * @Author: Hypocrite30
 * @Date: 2021/5/7 22:38
 */
public class Application {
    /* Input parameter format is correct */
    public static final int CORRECT_PARAMETERS = 2;
    /* Input parameter format is error */
    public static final int ERROR_PARAMETERS = -1;

    public static void main(String[] args) {
        if (args.length == CORRECT_PARAMETERS) {
            switch (args[0]) {
                case "-c":
                    System.out.println("\nNumber of characters:「 " + TextStatisticsUtils.CharCount(args[1]) + " 」\n");
                    break;
                case "-w":
                    System.out.println("\nNumber of characters:「 " + TextStatisticsUtils.WordCount(args[1]) + " 」\n");
                    break;
                default:
                    System.out.println("Input parameter format is wrong.");
            }
        } else {
            System.out.println("Input parameter format is wrong.");
            System.out.println("Correct format: [parameter][input_file_name]");
        }
    }
}
