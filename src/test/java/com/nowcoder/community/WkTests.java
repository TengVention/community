package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd ="G:/xiangmuplace/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com g:/xiangmuplace/data/wk-images/2.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
