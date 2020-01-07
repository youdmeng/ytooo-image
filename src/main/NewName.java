package main;

import java.util.UUID;

/**
 * Created by Youdmeng on 2020/1/7 0007.
 */
public class NewName {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
