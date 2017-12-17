package com.logonovo.lambda;

import java.util.function.Predicate;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/11/22 22:56
 */
public class Main {

    public static void main(String[] args) {
        Runnable noArgument = () -> System.out.println("hello world");
        noArgument.run();

    }


}
